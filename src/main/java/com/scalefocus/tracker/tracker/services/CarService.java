package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car saveCar(CarBindingModel carBindingModel);

    Car saveCar(Car car);

    Car updateCar(CarBindingModel carBindingModel);

    Car getCarById(Integer id);

    void deleteCar(Car car);

    List<Car> findCarsByModel(String model);

    List<Car> findCarsByProductionDate(String Productiondate);

    List<Car> findCarsByBodyType(String bodytype);

    List<Car> findCarsByColor(String color);

    List<Car> findCarsByTransmissionType(String transmissiontype);

    List<Car> findCarsByBrand(String brand);

    List<Car> findCarsByPrice(String price);

    List<Car> findCarsByFuelType(String fueltype);

    List<Car> findCarsBySearchFormCriteria(CarBindingModel carBindingModel);

}
