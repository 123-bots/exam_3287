package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "crimes")
public class Crimes implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "incident_id", nullable = false)
    private Long incident_id;
    @Column(name = "offence_code", nullable = false)
    private Long offence_code;
    @Column(name = "dispatch_time", nullable = false)
    private LocalDateTime dispatch_time;
    @Column(name = "victims", nullable = false)
    private Long victims;
    @Column(name = "city", nullable = false)
    private String city;
    @Column(name = "start_date_time", nullable = false)
    private LocalDateTime start_date_time;
}
