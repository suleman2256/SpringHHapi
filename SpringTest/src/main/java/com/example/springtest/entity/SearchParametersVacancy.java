package com.example.springtest.entity;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class SearchParametersVacancy {
    private Long id;
    private Integer vacancy_id;
    private String name;
    private String experience;
    private String schedule;
    private Integer salary;
    private Integer page;
    private String area;

}
