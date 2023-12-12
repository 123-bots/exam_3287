package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class Offences implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "offence_code", nullable = false)
    private Long offence_code;

    @Column(name = "crime_name1", nullable = false)
    private Long crime_name1;
    @Column(name = "crime_name2", nullable = false)
    private Long crime_name2;
    @Column(name = "crime_name3", nullable = false)
    private Long crime_name3;
}
