package com.example.springtest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Table(schema = "springhh")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "Schedule_Id")
    private String id;
    @Column(name = "Schedule_Name")
    private String Name;

}