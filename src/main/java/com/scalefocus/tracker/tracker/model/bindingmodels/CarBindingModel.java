package com.scalefocus.tracker.tracker.model.bindingmodels;

import lombok.*;

@Data
public class CarBindingModel  {

    private Integer id;
    private String brand;
    private String model;
    private String bodyType;
    private String color;
    private String transmissionType;
    private String productionDate;
    private String fuelType;
    private Double price;

}
