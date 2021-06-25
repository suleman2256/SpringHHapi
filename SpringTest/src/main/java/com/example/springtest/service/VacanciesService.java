package com.example.springtest.service;

import com.example.springtest.entity.*;
import com.example.springtest.repositories.VacanciesRepository;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Objects;



@Service
public class VacanciesService {

    @Autowired
    VacanciesRepository vacanciesRepository;

    private RestTemplate restTemplate = new RestTemplate();
    private static final String hhApi = "https://api.hh.ru/vacancies";

    public Vacancies getAllVacancies() {
        return restTemplate.getForEntity(hhApi, Vacancies.class).getBody();
    }

    public Vacancies getAllVacancies(SearchParametersVacancy params) {
        String url = hhApi + "/?per_page20";
        if (Strings.isNotBlank(params.getName())) url += "&text=" + params.getName() + "&search_field=name";
        if (Strings.isNotBlank(params.getExperience())) url += "&experience=" + params.getExperience();
        if (Strings.isNotBlank(params.getArea())) url += "&area=" + params.getArea();
        if (Strings.isNotBlank(params.getSchedule())) url += "&schedule=" + params.getSchedule();
        if (Objects.nonNull(params.getSalary())) url += "&salary=" + params.getSalary();
        if (Objects.nonNull(params.getPage())) url += "&page=" + params.getPage();
        return restTemplate.getForEntity(url, Vacancies.class).getBody();
    }

    public Vacancy getVacancyById(String id) {
        return restTemplate.getForEntity(hhApi + "/" + id, Vacancy.class).getBody();
    }

}
