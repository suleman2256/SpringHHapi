package com.example.springtest.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Table(schema = "springhh", name = "vacancy")
public class Vacancy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Schedule_Id")
    private Schedule schedule;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Salary_Id")
    private Salary salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Experience_Id")
    private Experience experience;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Area_Id")
    private Area area;

}