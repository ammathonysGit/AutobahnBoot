package com.scalefocus.tracker.tracker;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.scalefocus.tracker.tracker.repository")
@EntityScan("com.scalefocus.tracker.tracker.entity")
@SpringBootApplication
public class TrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackerApplication.class, args);

//
//		Car carEKlasse = new Car();
//		carEKlasse.setBodytype("Saloon");
//		carEKlasse.setBrand("Mercedes");
//		carEKlasse.setColor("Black Metallic");
//		carEKlasse.setFueltype("Petrol");
//		carEKlasse.setPrice(50000.00);
//		carEKlasse.setTransmissiontype("Automatic");
//		carEKlasse.setModel("E Class 63 AMG");
//		carEKlasse.setProductiondate("2015");
//		carEKlasse.setHorsepower(610);
//		carEKlasse.setLocation("CA");
//		carEKlasse.setMileage(50);
//
//
//		CarBindingModel carBKlasse = new CarBindingModel();
//		carBKlasse.setBodytype("Saloon");
//
//		carBKlasse.setFueltype("Petrol");
//
//		carBKlasse.setTransmissiontype("Automatic");
//		carBKlasse.setModel("E Class 63 AMG");
//		carBKlasse.setProductiondateFrom("2015");
//		carBKlasse.setProductiondateto("2019");
//		carBKlasse.setPriceFrom(21000.00);
//		carBKlasse.setPriceto(80000.00);
//		carBKlasse.setLocation("CA");
//
//
//
//		System.out.println(isCarMatchingTheReuqirements(carBKlasse, carEKlasse));

	}
//
//	public static  boolean isCarMatchingTheReuqirements(CarBindingModel carBindingModel, Car car){
//		Integer productionDateFrom = Integer.parseInt(carBindingModel.getProductiondateFrom());
//		Integer productionDateTo = Integer.parseInt(carBindingModel.getProductiondateto());
//
//
//		return carBindingModel.getBodytype().equals(car.getBodytype()) && carBindingModel.getFueltype().equals(car.getFueltype())
//				&& carBindingModel.getLocation().equals(car.getLocation()) && carBindingModel.getTransmissiontype().equals(car.getTransmissiontype())
//				&& car.getModel().contains(carBindingModel.getModel())
//				&& carBindingModel.getPriceFrom().doubleValue() >= car.getPrice().doubleValue() && carBindingModel.getPriceto().doubleValue() <= car.getPrice().doubleValue()
//				&& productionDateFrom >= Integer.parseInt(car.getProductiondate())
//				&& productionDateTo <= Integer.parseInt(car.getProductiondate());
//	}


}
