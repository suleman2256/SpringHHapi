package com.example.springtest.controller;

import com.example.springtest.entity.SearchParametersVacancy;
import com.example.springtest.entity.Vacancy;
import com.example.springtest.repositories.AreaRepository;
import com.example.springtest.repositories.VacanciesRepository;
import com.example.springtest.service.VacanciesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/vacancies")
public class VacanciesController {

    @Autowired
    VacanciesService vacanciesService;

    @Autowired
    AreaRepository areaRepository;

    @Autowired
    VacanciesRepository vacanciesRepository;

    @Autowired
    public VacanciesController(VacanciesService vacanciesService) {
        this.vacanciesService = vacanciesService;
    }

    @GetMapping
    public ResponseEntity getAllVacancies(@RequestBody Vacancy vacancy) {
        return ResponseEntity.ok(vacanciesService.getAllVacancies().getItems());
    }

    @PostMapping
    public ResponseEntity getAllVacancies(@RequestBody SearchParametersVacancy params) {
        return ResponseEntity.ok(vacanciesService.getAllVacancies(params).getItems());
    }

    @GetMapping("/{vacId}")
    public ResponseEntity getVacancyById(@PathVariable String vacId) {
        return ResponseEntity.ok(vacanciesService.getVacancyById(vacId));
    }
}























    /*@Autowired
    public VacanciesController(VacanciesService vacanciesService) {
        this.vacanciesService = vacanciesService;
    }

    @GetMapping("allVacancies")
    public String getAllVacancies() {
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        return response.getBody();
    }

    @GetMapping("javaVacancies")
    public String getJavaVac() {
        ResponseEntity<String> response = restTemplate.exchange(url + "?text=java", HttpMethod.GET, null, String.class);
        return response.getBody();
    }

    @PostMapping(value = "", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String getVacancies(@RequestBody SearchParametersVacancy params) {
        String searchURL = SearchServiceImpl.getSearchURL(params);
        return "Got it.";
    }

    @PostMapping(value = "javaSearch", consumes = {MediaType.APPLICATION_JSON_VALUE})
    public String  getJavaVacancies() {
        return "Поиск завершён"; //// пока работает
    }*/





