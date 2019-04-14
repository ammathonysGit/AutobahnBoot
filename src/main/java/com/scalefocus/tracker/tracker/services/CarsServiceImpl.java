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


    private  CarsRepository carsRepository;
    private final CarMapper carMapper;

    @Autowired
    public CarsServiceImpl(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
        this.carMapper =  CarMapper.INSTANCE;
    }


    @Override
    public List<Car> getAllCars() {
        List<Car> carList = carsRepository.findAll();

        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        return carList;
    }

    @Override
    public Car saveCar(CarBindingModel carBindingModel) {
       Car car = carMapper.bindingModelToCar(carBindingModel);
       carsRepository.saveAndFlush(car);

       return car;
    }

    @Override
    public Car updateCar(CarBindingModel carBindingModel) {
        Car car = carMapper.bindingModelToCar(carBindingModel);
        carsRepository.save(car);

        return car;
    }

    @Override
    public void deleteCar(Car car) {
        if (car != null) {
            carsRepository.delete(car);
        }
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
    public List<Car> findCarsByProductionDate(String Productiondate) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getProductiondate().equals(Productiondate)) {
                carList.remove(car);
            }
        }

        return carList;
    }

    @Override
    public List<Car> findCarsByBodyType(String bodytype) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getBodytype().equals(bodytype)) {
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
    public List<Car> findCarsByTransmissionType(String transmissiontype) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getTransmissiontype().equals(transmissiontype)) {
                carList.remove(car);
            }
        }

        return carList;
    }

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
    public List<Car> findCarsByFuelType(String fueltype) {
        List<Car> carList = carsRepository.findAll();
        if (carList == null) {
            throw new NoCarsFoundException("No Cars Found", new Throwable().getCause());
        }

        for (Car car: carList) {
            if (!car.getFueltype().equals(fueltype)) {
                carList.remove(car);
            }
        }

        return carList;
    }

}
