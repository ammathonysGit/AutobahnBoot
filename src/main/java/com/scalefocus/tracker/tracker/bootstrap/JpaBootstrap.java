package com.scalefocus.tracker.tracker.bootstrap;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.services.CarService;
import org.joda.time.DateTime;
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
        Car carCKlasse = new Car();
        carCKlasse.setBodytype("Sedan");
        carCKlasse.setBrand("Mercedes");
        carCKlasse.setColor("Silver Metallic");
        carCKlasse.setFueltype("Petrol");
        carCKlasse.setPrice(100000.00);
        carCKlasse.setTransmissiontype("Automatic");
        carCKlasse.setModel("C Class 220 CDI");
        carCKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carCKlasse.setHorsepower(204);
        carCKlasse.setLocation("CA");
        carCKlasse.setMileage(300);
        carCKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carCKlasse);

        Car carEKlasse = new Car();
        carEKlasse.setBodytype("Saloon");
        carEKlasse.setBrand("Mercedes");
        carEKlasse.setColor("Black Metallic");
        carEKlasse.setFueltype("Petrol");
        carEKlasse.setPrice(50000.00);
        carEKlasse.setTransmissiontype("Automatic");
        carEKlasse.setModel("E Class 63 AMG");
        carEKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carEKlasse.setHorsepower(610);
        carEKlasse.setLocation("CA");
        carEKlasse.setMileage(50);
        carEKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");
        carService.saveCar(carEKlasse);

        Car carE2Klasse = new Car();
        carE2Klasse.setBodytype("Saloon");
        carE2Klasse.setBrand("Mercedes");
        carE2Klasse.setColor("Black Metallic");
        carE2Klasse.setFueltype("Petrol");
        carE2Klasse.setPrice(50000.00);
        carE2Klasse.setTransmissiontype("Automatic");
        carE2Klasse.setModel("E Class 63 AMG");
        carE2Klasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carE2Klasse.setHorsepower(610);
        carE2Klasse.setLocation("CA");
        carE2Klasse.setMileage(50);
        carE2Klasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carE2Klasse);

        Car carE3Klasse = new Car();
        carE3Klasse.setBodytype("Saloon");
        carE3Klasse.setBrand("Mercedes");
        carE3Klasse.setColor("Black Metallic");
        carE3Klasse.setFueltype("Petrol");
        carE3Klasse.setPrice(50000.00);
        carE3Klasse.setTransmissiontype("Automatic");
        carE3Klasse.setModel("E Class 63 AMG");
        carE3Klasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carE3Klasse.setHorsepower(610);
        carE3Klasse.setLocation("CA");
        carE3Klasse.setMileage(50);
        carE3Klasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carE3Klasse);

        Car carGKlasse = new Car();
        carGKlasse.setBodytype("SUV");
        carGKlasse.setBrand("Mercedes");
        carGKlasse.setColor("Black");
        carGKlasse.setFueltype("Petrol");
        carGKlasse.setPrice(350000.00);
        carGKlasse.setTransmissiontype("Automatic");
        carGKlasse.setModel("G Class 65 AMG");
        carGKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carGKlasse.setHorsepower(800);
        carGKlasse.setMileage(100);
        carGKlasse.setLocation("LA");
        carGKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carGKlasse);

        Car carSKlasse = new Car();
        carSKlasse.setBodytype("Limousine");
        carSKlasse.setBrand("Mercedes");
        carSKlasse.setColor("Silver Arrow");
        carSKlasse.setFueltype("Petrol");
        carSKlasse.setPrice(170000.00);
        carSKlasse.setTransmissiontype("Automatic");
        carSKlasse.setModel("S Class 550");
        carSKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carSKlasse.setHorsepower(510);
        carSKlasse.setLocation("CA");
        carSKlasse.setMileage(20);
        carSKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");
        carService.saveCar(carSKlasse);

        Car carCLAKlasse = new Car();
        carCLAKlasse.setBodytype("Sedan");
        carCLAKlasse.setBrand("Mercedes");
        carCLAKlasse.setColor("Black Arrow");
        carCLAKlasse.setFueltype("Petrol");
        carCLAKlasse.setPrice(90000.00);
        carCLAKlasse.setTransmissiontype("Automatic");
        carCLAKlasse.setModel("CLA Class 350");
        carCLAKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carCLAKlasse.setHorsepower(320);
        carCLAKlasse.setLocation("CA");
        carCLAKlasse.setMileage(20);
        carCLAKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carCLAKlasse);

        Car carGLKKlasse = new Car();
        carGLKKlasse.setBodytype("SUV");
        carGLKKlasse.setBrand("Mercedes");
        carGLKKlasse.setColor("Black");
        carGLKKlasse.setFueltype("Diesel");
        carGLKKlasse.setPrice(75000.00);
        carGLKKlasse.setTransmissiontype("Automatic");
        carGLKKlasse.setModel("GLK Class 420 CDI");
        carGLKKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carGLKKlasse.setHorsepower(350);
        carGLKKlasse.setLocation("CA");
        carGLKKlasse.setMileage(157);
        carGLKKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carGLKKlasse);

        Car carBKlasse = new Car();
        carBKlasse.setBodytype("SUV");
        carBKlasse.setBrand("Mercedes");
        carBKlasse.setColor("Silver");
        carBKlasse.setFueltype("Diesel");
        carBKlasse.setPrice(60000.00);
        carBKlasse.setTransmissiontype("Manual");
        carBKlasse.setModel("B Class 350 CDI");
        carBKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carBKlasse.setHorsepower(300);
        carBKlasse.setLocation("CA");
        carBKlasse.setMileage(200);
        carBKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carBKlasse);

        Car carXKlasse = new Car();
        carXKlasse.setBodytype("SUV");
        carXKlasse.setBrand("Mercedes");
        carXKlasse.setColor("White");
        carXKlasse.setFueltype("Diesel");
        carXKlasse.setPrice(13000.00);
        carXKlasse.setTransmissiontype("Automatic");
        carXKlasse.setModel("X Class 420 CDI");
        carXKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carXKlasse.setHorsepower(350);
        carXKlasse.setLocation("CA");
        carXKlasse.setMileage(200);
        carXKlasse.setImageUrl("https://images.betweentheaxles.net/mercedes_amg_c63_coupe_c205_2015/mercedes-amg-c63-s-coupe-c205-100_sfce6.jpg");

        carService.saveCar(carXKlasse);
    }

}
