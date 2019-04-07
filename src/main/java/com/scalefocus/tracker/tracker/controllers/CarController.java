package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.exceptions.NoCarsFoundException;
import com.scalefocus.tracker.tracker.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    CarsRepository carsRepository;

    @GetMapping(value = "/all")
    public List<Car> getAllCars() {
        List <Car> cars = carsRepository.findAll();

        if (cars == null) {
        throw new NoCarsFoundException("No cars found", new Throwable());
        }

        return cars;
    }

}
