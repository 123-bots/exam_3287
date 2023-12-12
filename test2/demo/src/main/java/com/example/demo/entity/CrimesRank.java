package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CrimesRank implements BaseEntity {

    private String city;

    private Double riskIndex;

    private Integer rank;
}
