package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.exceptions.NoCarsFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component
public class CarsRepositoryCustom implements CarsRepository{

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











    @Override
    public List<Car> findAll() {
        return null;
    }

    @Override
    public List<Car> findAll(Sort sort) {
        return null;
    }

    @Override
    public List<Car> findAllById(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Car car) {

    }

    @Override
    public void deleteAll(Iterable<? extends Car> iterable) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Car> S save(S s) {
        return null;
    }

    @Override
    public <S extends Car> List<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Car> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Car> S saveAndFlush(S s) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Car> iterable) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Car getOne(Integer integer) {
        return null;
    }

    @Override
    public <S extends Car> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Car> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Car> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public Page<Car> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Car> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Car> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Car> boolean exists(Example<S> example) {
        return false;
    }
}
