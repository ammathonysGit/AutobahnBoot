package com.scalefocus.tracker.tracker.model;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.exceptions.NoCarsFoundException;
import com.scalefocus.tracker.tracker.repository.CarsRepository;
import com.scalefocus.tracker.tracker.repository.CarsRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarsRepository carsRepository;

    @Autowired
    private CarsRepositoryCustom carsRepositoryCustom;


    public List<Car> getAllCars() {
        List<Car> carList = carsRepository.findAll();

        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        return carList;
    }

    public List<Car> findCarsByModel(String model) {
      return carsRepositoryCustom.findCarsByModel(model);
    }

    public List<Car> findCarsByProductionDate(String ProductionDate) {
        return carsRepositoryCustom.findCarsByProductionDate(ProductionDate);
    }

    public List<Car> findCarsByBodyType(String bodyType) {
        return carsRepositoryCustom.findCarsByBodyType(bodyType);
    }

    public List<Car> findCarsByColor(String color) {
        return carsRepositoryCustom.findCarsByColor(color);
    }

    public List<Car> findCarsByTransmissionType(String transmissionType) {
        return carsRepositoryCustom.findCarsByTransmissionType(transmissionType);
    }

    public List<Car> findCarsByBrand(String brand) {
        return carsRepositoryCustom.findCarsByBrand(brand);
    }

    public List<Car> findCarsByPrice(String price) {
        return carsRepositoryCustom.findCarsByPrice(price);
    }

    public List<Car> findCarsByFuelType(String fuelType) {
        return carsRepositoryCustom.findCarsByFuelType(fuelType);
    }



    public Car findCarById(Integer id) {
        return carsRepository.findById(id).get();
    }

    public void saveCar(Car car) {
        if (car != null) {
            carsRepository.save(car);
        }
    }

    public void updateCar(Car car) {
        if (car != null) {
            carsRepository.save(car);
        }
    }

    public void deleteCar(Car car) {
        if (car != null) {
            carsRepository.delete(car);
        }
    }

    public void deleteAllCars() {
        carsRepository.deleteAll();
    }



}
