package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.exceptions.NoCarsFoundException;
import com.scalefocus.tracker.tracker.mappers.CarMapper;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import com.scalefocus.tracker.tracker.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsServiceImpl implements CarService {


    private final CarService carService;
    private final CarsRepository carsRepositoryCustom;
    private final CarMapper carMapper;

    @Autowired
    public CarsServiceImpl(CarService carService, CarsRepository carsRepository) {
        this.carService = carService;
        this.carsRepositoryCustom = carsRepository;
        this.carMapper =  CarMapper.INSTANCE;
    }


    @Override
    public List<Car> getAllCars() {
        List<Car> carList = carsRepositoryCustom.findAll();

        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        return carList;
    }

    @Override
    public Car saveCar(CarBindingModel carBindingModel) {
       Car car = carMapper.bindingModelToCar(carBindingModel);
       carsRepositoryCustom.saveAndFlush(car);

       return car;
    }

    @Override
    public Car updateCar(CarBindingModel carBindingModel) {
        Car car = carMapper.bindingModelToCar(carBindingModel);
        carsRepositoryCustom.save(car);

        return car;
    }

    @Override
    public void deleteCar(Car car) {
        if (car != null) {
            carsRepositoryCustom.delete(car);
        }
    }

}
