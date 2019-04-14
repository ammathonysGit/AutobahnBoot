package com.scalefocus.tracker.tracker.bootstrap;

import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import com.scalefocus.tracker.tracker.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class JpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CarService carService;

    @Autowired
    public JpaBootstrap(CarService carService) {
        this.carService = carService;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    loadCars();
    }

    private void loadCars() {
        CarBindingModel carCKlasse = new CarBindingModel();
        carCKlasse.setBodytype("Sedan");
        carCKlasse.setBrand("Mercedes");
        carCKlasse.setColor("Silver Metallic");
        carCKlasse.setFueltype("Petrol");
        carCKlasse.setPrice(100000.00);
        carCKlasse.setTransmissiontype("Automatic");
        carCKlasse.setModel("C Class 220 CDI");
        carCKlasse.setProductiondate("12/12/2018");
        carCKlasse.setHorsepower(204);

        carService.saveCar(carCKlasse);

        CarBindingModel carEKlasse = new CarBindingModel();
        carEKlasse.setBodytype("Sedan");
        carEKlasse.setBrand("Mercedes");
        carEKlasse.setColor("Black Metallic");
        carEKlasse.setFueltype("Petrol");
        carEKlasse.setPrice(120000.00);
        carEKlasse.setTransmissiontype("Automatic");
        carEKlasse.setModel("E Class 63 AMG");
        carEKlasse.setProductiondate("01/01/2019");
        carEKlasse.setHorsepower(610);

        carService.saveCar(carEKlasse);

        CarBindingModel carGKlasse = new CarBindingModel();
        carGKlasse.setBodytype("SUV");
        carGKlasse.setBrand("Mercedes");
        carGKlasse.setColor("Black");
        carGKlasse.setFueltype("Petrol");
        carGKlasse.setPrice(350000.00);
        carGKlasse.setTransmissiontype("Automatic");
        carGKlasse.setModel("G Class 65 AMG");
        carGKlasse.setProductiondate("21/02/2019");
        carGKlasse.setHorsepower(800);

        carService.saveCar(carGKlasse);

        CarBindingModel carSKlasse = new CarBindingModel();
        carSKlasse.setBodytype("Limousine");
        carSKlasse.setBrand("Mercedes");
        carSKlasse.setColor("Silver Arrow");
        carSKlasse.setFueltype("Petrol");
        carSKlasse.setPrice(170000.00);
        carSKlasse.setTransmissiontype("Automatic");
        carSKlasse.setModel("S Class 550");
        carSKlasse.setProductiondate("17/01/2019");
        carSKlasse.setHorsepower(510);

        carService.saveCar(carSKlasse);
    }

}
