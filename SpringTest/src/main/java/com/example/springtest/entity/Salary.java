package com.example.springtest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(schema = "springhh")
public class Salary {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "Salary_To")
    private String To;
    @Column(name = "Salary_From")
    private String From;

}
