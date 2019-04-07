package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarsRepository extends JpaRepository<Car, Integer> {

    List<Car> findCarsByModel(String model);
    List<Car> findCarsByProductionDate(String ProductionDate);
    List<Car> findCarsByBodyType(String bodyType);
    List<Car> findCarsByColor(String color);
    List<Car> findCarsByTransmissionType(String transmissionType);
    List<Car> findCarsByBrand(String brand);
    List<Car> findCarsByPrice(String price);
    List<Car> findCarsByFuelType(String fuelType);


}
