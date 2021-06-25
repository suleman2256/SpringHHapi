package com.example.springtest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(schema = "springhh")
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pk;

    @Column(name = "Experience_Id")
    private String id;
    @Column(name = "Experience_Name")
    private String Name;

}
