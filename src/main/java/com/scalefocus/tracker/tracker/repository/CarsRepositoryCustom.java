package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.exceptions.NoCarsFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class CarsRepositoryCustom implements CarsRepository{

    @Autowired
    CarsRepository carsRepository;

    @Override
    public List<Car> findCarsByBrand(String brand) {
       List<Car> carList = carsRepository.findAll();
       if (carList == null) {
           throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
       }

       for(Car car: carList) {
           if (!car.getBrand().equals(brand)){
               carList.remove(car);
           }
       }

       return carList;
    }

    @Override
    public List<Car> findCarsByBodyType(String bodyType) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getBodyType().equals(bodyType)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByModel(String model) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getModel().equals(model)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByColor(String color) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getColor().equals(color)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByFuelType(String fuelType) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getFuelType().equals(fuelType)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByPrice(String price) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getPrice().equals(price)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByProductionDate(String productionDate) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getProductionDate().equals(productionDate)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByTransmissionType(String transmissionType) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getTransmissionType().equals(transmissionType)) {
                carList.remove(car);
            }
        }

        return carList;
    }



}
