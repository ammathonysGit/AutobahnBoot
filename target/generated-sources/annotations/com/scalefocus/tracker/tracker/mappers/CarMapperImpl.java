package com.scalefocus.tracker.tracker.mappers;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-04-22T11:54:43+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_201 (Oracle Corporation)"
)
public class CarMapperImpl implements CarMapper {

    @Override
    public CarBindingModel carToBindingModel(Car car) {
        if ( car == null ) {
            return null;
        }

        CarBindingModel carBindingModel = new CarBindingModel();

        carBindingModel.setId( car.getId() );
        carBindingModel.setBrand( car.getBrand() );
        carBindingModel.setModel( car.getModel() );
        carBindingModel.setBodytype( car.getBodytype() );
        carBindingModel.setColor( car.getColor() );
        carBindingModel.setTransmissiontype( car.getTransmissiontype() );
        carBindingModel.setFueltype( car.getFueltype() );
        carBindingModel.setHorsepower( car.getHorsepower() );
        carBindingModel.setMileage( car.getMileage() );
        carBindingModel.setLocation( car.getLocation() );

        return carBindingModel;
    }

    @Override
    public Car bindingModelToCar(CarBindingModel carBindingModel) {
        if ( carBindingModel == null ) {
            return null;
        }

        Car car = new Car();

        car.setMileage( carBindingModel.getMileage() );
        car.setLocation( carBindingModel.getLocation() );
        car.setId( carBindingModel.getId() );
        car.setBrand( carBindingModel.getBrand() );
        car.setModel( carBindingModel.getModel() );
        car.setBodytype( carBindingModel.getBodytype() );
        car.setColor( carBindingModel.getColor() );
        car.setTransmissiontype( carBindingModel.getTransmissiontype() );
        car.setFueltype( carBindingModel.getFueltype() );
        car.setHorsepower( carBindingModel.getHorsepower() );

        return car;
    }
}
