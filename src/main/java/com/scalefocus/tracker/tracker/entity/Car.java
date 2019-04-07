package com.scalefocus.tracker.tracker.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String bodyType;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String transmissionType;
    @Column(nullable = false)
    private String productionDate;
    @Column(nullable = false)
    private String fuelType;
    @Column(nullable = false)
    private Double price;

}
