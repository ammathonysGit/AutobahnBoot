package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    Car saveCar(CarBindingModel carBindingModel);

    Car updateCar(CarBindingModel carBindingModel);

    void deleteCar(Car car);

}
