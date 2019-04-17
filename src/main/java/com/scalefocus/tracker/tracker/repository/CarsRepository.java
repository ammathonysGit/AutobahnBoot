package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import org.joda.time.DateTime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<Car, Integer> {

    List<Car> findAllByPriceBetween(Integer low, Integer hi);

    List<Car> findByBodytypeAndFueltypeAndTransmissiontypeAndLocationAndModelContainsAndPriceBetweenAndProductiondateBetween(String bodyType, String fuelType,String transmission, String location,
                                                                                                                      String model, Double priceFrom, Double priceTo,
                                                                                                                      DateTime productionDateFrom, DateTime productionTo);
}
