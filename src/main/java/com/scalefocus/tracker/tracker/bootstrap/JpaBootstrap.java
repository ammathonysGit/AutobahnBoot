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
        carCKlasse.setLocation("BG, Sofia");
        carCKlasse.setMileage(300);

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
        carEKlasse.setLocation("BG, Sofia");
        carEKlasse.setMileage(50);

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
        carGKlasse.setMileage(100);
        carGKlasse.setLocation("LA, B.H");

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
        carSKlasse.setLocation("CA, C.C");
        carSKlasse.setMileage(20);

        carService.saveCar(carSKlasse);

        CarBindingModel carCLAKlasse = new CarBindingModel();
        carCLAKlasse.setBodytype("Sedan");
        carCLAKlasse.setBrand("Mercedes");
        carCLAKlasse.setColor("Black Arrow");
        carCLAKlasse.setFueltype("Petrol");
        carCLAKlasse.setPrice(90000.00);
        carCLAKlasse.setTransmissiontype("Automatic");
        carCLAKlasse.setModel("CLA Class 350");
        carCLAKlasse.setProductiondate("17/01/2019");
        carCLAKlasse.setHorsepower(320);
        carCLAKlasse.setLocation("CA, C.C");
        carCLAKlasse.setMileage(20);

        carService.saveCar(carCLAKlasse);

        CarBindingModel carGLKKlasse = new CarBindingModel();
        carGLKKlasse.setBodytype("SUV");
        carGLKKlasse.setBrand("Mercedes");
        carGLKKlasse.setColor("Black");
        carGLKKlasse.setFueltype("Diesel");
        carGLKKlasse.setPrice(95000.00);
        carGLKKlasse.setTransmissiontype("Automatic");
        carGLKKlasse.setModel("GLK Class 420 CDI");
        carGLKKlasse.setProductiondate("17/01/2019");
        carGLKKlasse.setHorsepower(350);
        carGLKKlasse.setLocation("CA, C.C");
        carGLKKlasse.setMileage(157);

        carService.saveCar(carGLKKlasse);

        CarBindingModel carBKlasse = new CarBindingModel();
        carBKlasse.setBodytype("SUV");
        carBKlasse.setBrand("Mercedes");
        carBKlasse.setColor("Silver");
        carBKlasse.setFueltype("Diesel");
        carBKlasse.setPrice(95000.00);
        carBKlasse.setTransmissiontype("Manual");
        carBKlasse.setModel("B Class 350 CDI");
        carBKlasse.setProductiondate("20/03/2019");
        carBKlasse.setHorsepower(300);
        carBKlasse.setLocation("CA, C.C");
        carBKlasse.setMileage(200);

        carService.saveCar(carBKlasse);

        CarBindingModel carXKlasse = new CarBindingModel();
        carXKlasse.setBodytype("SUV");
        carXKlasse.setBrand("Mercedes");
        carXKlasse.setColor("White");
        carXKlasse.setFueltype("Diesel");
        carXKlasse.setPrice(13000.00);
        carXKlasse.setTransmissiontype("Automatic");
        carXKlasse.setModel("X Class 420 CDI");
        carXKlasse.setProductiondate("20/03/2019");
        carXKlasse.setHorsepower(350);
        carXKlasse.setLocation("CA, C.C");
        carXKlasse.setMileage(200);

        carService.saveCar(carXKlasse);
    }

}
