package com.practice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq_gen")
    @SequenceGenerator(
            name = "student_seq_gen",
            sequenceName = "student_seq",
            allocationSize = 1
    )
    private Integer id;
    private String name;
    private  byte age;
    private String email;
    private String city;

}
