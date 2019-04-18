package com.scalefocus.tracker.tracker.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer id;
    @Version
    private Integer version;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String model;
    @Column(nullable = false)
    private String bodytype;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private String transmissiontype;
    @Column(nullable = false, length = 500)
    private DateTime productiondate;
    @Column(nullable = false)
    private String fueltype;
    @Column(nullable = false)
    private Double price;
    private Integer horsepower;
    private Integer mileage;
    private String location;
    private String imageurl;

    public String getImageUrl() {
        return imageurl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageurl = imageUrl;
    }

    public DateTime getProductiondate() {
        return productiondate;
    }

    public void setProductiondate(DateTime productiondate) {
        this.productiondate = productiondate;
    }

    public Car () { }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(Integer horsepower) {
        this.horsepower = horsepower;
    }
}
