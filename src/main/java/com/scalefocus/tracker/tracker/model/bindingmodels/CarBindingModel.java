package com.scalefocus.tracker.tracker.model.bindingmodels;

import lombok.*;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import java.util.Date;

@Getter
@Setter
public class  CarBindingModel  {

    private Integer id;
    private String brand;
    private String model;
    private String bodytype;
    private String color;
    private String transmissiontype;
    private String productiondatefrom;
    private String productiondateto;
    private String fueltype;
    private Double pricefrom;
    private Double priceto;
    private Integer horsepower;
    private Integer mileage;
    private String location;
    private String condition;
    private String numberofdoors;

    public String getProductiondatefrom() {
        return productiondatefrom;
    }

    public void setProductiondatefrom(String productiondatefrom) {
        this.productiondatefrom = productiondatefrom;
    }

    public String getProductiondateto() {
        return productiondateto;
    }

    public void setProductiondateto(String productiondateto) {
        this.productiondateto = productiondateto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBodytype() {
        return bodytype;
    }

    public void setBodytype(String bodytype) {
        this.bodytype = bodytype;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmissiontype() {
        return transmissiontype;
    }

    public void setTransmissiontype(String transmissiontype) {
        this.transmissiontype = transmissiontype;
    }

    public String getFueltype() {
        return fueltype;
    }

    public void setFueltype(String fueltype) {
        this.fueltype = fueltype;
    }

    public Double getPricefrom() {
        return pricefrom;
    }

    public void setPricefrom(Double pricefrom) {
        this.pricefrom = pricefrom;
    }

    public Double getPriceto() {
        return priceto;
    }

    public void setPriceto(Double priceto) {
        this.priceto = priceto;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getNumberofdoors() {
        return numberofdoors;
    }

    public void setNumberofdoors(String numberofdoors) {
        this.numberofdoors = numberofdoors;
    }
}
