package com.scalefocus.tracker.tracker.bootstrap;

import com.scalefocus.tracker.tracker.entity.Car;
import com.scalefocus.tracker.tracker.entity.Rim;
import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.services.CarService;
import com.scalefocus.tracker.tracker.services.RimService;
import com.scalefocus.tracker.tracker.services.UserService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;



@Component
public class JpaBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private CarService carService;
    private RimService rimService;
    private UserService userService;

    @Autowired
    public JpaBootstrap(CarService carService, RimService rimService, UserService userService) {
        this.carService = carService;
        this.rimService = rimService;
        this.userService = userService;
    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    loadCars();
    loadRims();
//    loadUsers();
    }

    private void loadCars() {
        Car carCKlasse = new Car();
        carCKlasse.setBodytype("Saloon");
        carCKlasse.setBrand("Mercedes");
        carCKlasse.setColor("Silver Metallic");
        carCKlasse.setFueltype("Petrol");
        carCKlasse.setPrice(80000.00);
        carCKlasse.setTransmissiontype("Automatic");
        carCKlasse.setModel("C Class 220 CDI");
        carCKlasse.setProductiondate(new DateTime().withYear(2018).withMonthOfYear(2).withDayOfMonth(6));
        carCKlasse.setHorsepower(204);
        carCKlasse.setLocation("CA");
        carCKlasse.setMileage(300);
        carCKlasse.setImageUrl("mercedes-c-klasse.jpg");

        carService.saveCar(carCKlasse);

        Car carEKlasse = new Car();
        carEKlasse.setBodytype("Saloon");
        carEKlasse.setBrand("Mercedes");
        carEKlasse.setColor("Silver");
        carEKlasse.setFueltype("Petrol");
        carEKlasse.setPrice(130000.00);
        carEKlasse.setTransmissiontype("Automatic");
        carEKlasse.setModel("E Class 63 AMG");
        carEKlasse.setProductiondate(new DateTime().withYear(2019).withMonthOfYear(1).withDayOfMonth(24));
        carEKlasse.setHorsepower(610);
        carEKlasse.setLocation("CA");
        carEKlasse.setMileage(200);
        carEKlasse.setImageUrl("mercedes-e-klasse.jpg");

        carService.saveCar(carEKlasse);

        Car carGKlasse = new Car();
        carGKlasse.setBodytype("SUV");
        carGKlasse.setBrand("Mercedes");
        carGKlasse.setColor("Black Metallic");
        carGKlasse.setFueltype("Petrol");
        carGKlasse.setPrice(350000.00);
        carGKlasse.setTransmissiontype("Automatic");
        carGKlasse.setModel("G Class 63 AMG");
        carGKlasse.setProductiondate(new DateTime().withYear(2019).withMonthOfYear(2).withDayOfMonth(6));
        carGKlasse.setHorsepower(610);
        carGKlasse.setLocation("CA");
        carGKlasse.setMileage(50);
        carGKlasse.setImageUrl("mercedes-g-klasse.jpg");

        carService.saveCar(carGKlasse);

        Car carSKlasse = new Car();
        carSKlasse.setBodytype("Limousine");
        carSKlasse.setBrand("Mercedes");
        carSKlasse.setColor("Black Metallic");
        carSKlasse.setFueltype("Petrol");
        carSKlasse.setPrice(120000.00);
        carSKlasse.setTransmissiontype("Automatic");
        carSKlasse.setModel("S Class 63 AMG");
        carSKlasse.setProductiondate(new DateTime().withYear(2019).withMonthOfYear(3).withDayOfMonth(6));
        carSKlasse.setHorsepower(610);
        carSKlasse.setLocation("CA");
        carSKlasse.setMileage(50);
        carSKlasse.setImageUrl("S klasse.jpg");

        carService.saveCar(carSKlasse);

        Car carW124asse = new Car();
        carW124asse.setBodytype("Saloon");
        carW124asse.setBrand("Mercedes");
        carW124asse.setColor("Black");
        carW124asse.setFueltype("Petrol");
        carW124asse.setPrice(75000.0);
        carW124asse.setTransmissiontype("Automatic");
        carW124asse.setModel("W124 E 500");
        carW124asse.setProductiondate(new DateTime().withYear(1993).withMonthOfYear(3).withDayOfMonth(8));
        carW124asse.setHorsepower(326);
        carW124asse.setMileage(123513);
        carW124asse.setLocation("LA");
        carW124asse.setImageUrl("mercedesW124E500.jpg");

        carService.saveCar(carW124asse);

        Car carW201Klasse = new Car();
        carW201Klasse.setBodytype("Saloon");
        carW201Klasse.setBrand("Mercedes");
        carW201Klasse.setColor("Black Metallic");
        carW201Klasse.setFueltype("Petrol");
        carW201Klasse.setPrice(60000.0);
        carW201Klasse.setTransmissiontype("Manual");
        carW201Klasse.setModel("W201 190 E 2.5-1.6");
        carW201Klasse.setProductiondate(new DateTime().withYear(1991).withMonthOfYear(6).withDayOfMonth(24));
        carW201Klasse.setHorsepower(235);
        carW201Klasse.setLocation("LA");
        carW201Klasse.setMileage(73846);
        carW201Klasse.setImageUrl("mercedesW201Evo.jpg");
        carService.saveCar(carW201Klasse);

        Car carW140Klasse = new Car();
        carW140Klasse.setBodytype("Limousine");
        carW140Klasse.setBrand("Mercedes");
        carW140Klasse.setColor("Black Metallic");
        carW140Klasse.setFueltype("Petrol");
        carW140Klasse.setPrice(35000.00);
        carW140Klasse.setTransmissiontype("Automatic");
        carW140Klasse.setModel("W140 S500");
        carW140Klasse.setProductiondate(new DateTime().withYear(1994).withMonthOfYear(9).withDayOfMonth(1));
        carW140Klasse.setHorsepower(306);
        carW140Klasse.setLocation("CA");
        carW140Klasse.setMileage(48607);
        carW140Klasse.setImageUrl("mercedesW140.jpg");

        carService.saveCar(carW140Klasse);

        Car carW123Klasse = new Car();
        carW123Klasse.setBodytype("Saloon");
        carW123Klasse.setBrand("Mercedes");
        carW123Klasse.setColor("Black");
        carW123Klasse.setFueltype("Diesel");
        carW123Klasse.setPrice(20000.00);
        carW123Klasse.setTransmissiontype("Manual");
        carW123Klasse.setModel("W123 200D");
        carW123Klasse.setProductiondate(new DateTime().withYear(1978).withMonthOfYear(11).withDayOfMonth(27));
        carW123Klasse.setHorsepower(75);
        carW123Klasse.setLocation("CA");
        carW123Klasse.setMileage(128543);
        carW123Klasse.setImageUrl("mercedesW123.jpg");

        carService.saveCar(carW123Klasse);

        Car carCLSKlasse = new Car();
        carCLSKlasse.setBodytype("Coupe");
        carCLSKlasse.setBrand("Mercedes");
        carCLSKlasse.setColor("Black");
        carCLSKlasse.setFueltype("Petrol");
        carCLSKlasse.setPrice(60000.00);
        carCLSKlasse.setTransmissiontype("Automatic");
        carCLSKlasse.setModel("CLS Class 500");
        carCLSKlasse.setProductiondate(new DateTime().withYear(2019).withMonthOfYear(2).withDayOfMonth(1));
        carCLSKlasse.setHorsepower(510);
        carCLSKlasse.setLocation("CA");
        carCLSKlasse.setMileage(20);
        carCLSKlasse.setImageUrl("mercedesCLS.jpg");

        carService.saveCar(carCLSKlasse);

    }

    private void loadRims() {
        Rim rim = new Rim();
        rim.setBrand("Mercedes-Benz");
        rim.setPrice(2000.0);
        rim.setColour("Silver");
        rim.setImageurl("AMG Style C63AMG E63.jpg");
        rim.setSize(19);

        rimService.saveRim(rim);

        Rim rim1 = new Rim();
        rim1.setBrand("Mercedes-Benz");
        rim1.setPrice(2250.0);
        rim1.setColour("Silver");
        rim1.setImageurl("AMG Style N015.jpg");
        rim1.setSize(18);

        rimService.saveRim(rim1);

        Rim rim2 = new Rim();
        rim2.setBrand("Mercedes-Benz");
        rim2.setPrice(2500.0);
        rim2.setColour("Black");
        rim2.setImageurl("AMG StyleC63AMG.jpg");
        rim2.setSize(19);

        rimService.saveRim(rim2);

        Rim rim3 = new Rim();
        rim3.setBrand("Mercedes-Benz");
        rim3.setPrice(3000.0);
        rim3.setColour("Grey");
        rim3.setImageurl("AMG-Style GTS .jpg");

        rim3.setSize(20);

        rimService.saveRim(rim3);

        Rim rim4 = new Rim();
        rim4.setBrand("Mercedes-Benz");
        rim4.setPrice(4000.0);
        rim4.setColour("White");
        rim4.setImageurl("S63 S65 W222 AMG Style.jpg");
        rim4.setSize(19);

        rimService.saveRim(rim4);

        Rim rim5 = new Rim();
        rim5.setBrand("Mercedes-Benz");
        rim5.setPrice(4500.0);
        rim5.setColour("Silver");
        rim5.setImageurl("S65 S63 ML63 AMG-Style.jpg");
        rim5.setSize(19);

        rimService.saveRim(rim5);

        Rim rim6 = new Rim();
        rim6.setBrand("Mercedes-Benz");
        rim6.setPrice(5000.0);
        rim6.setColour("Silver");
        rim6.setImageurl("G63AMGStyle.jpg");
        rim6.setSize(20);

        rimService.saveRim(rim6);

        Rim rim7 = new Rim();
        rim7.setBrand("Mercedes-Benz");
        rim7.setPrice(4000.0);
        rim7.setColour("Black");
        rim7.setImageurl("AMGStyleMONOBLOCKAERO.jpg");
        rim7.setSize(18);

        rimService.saveRim(rim7);

        Rim rim8 = new Rim();
        rim8.setBrand("Mercedes-Benz");
        rim8.setPrice(6000.0);
        rim8.setColour("Silver");
        rim8.setImageurl("AMGStyle.jpg");
        rim8.setSize(20);

        rimService.saveRim(rim8);

    }

    private void loadUsers() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("admin");

        userService.saveUser(user);
    }

}
