package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarsRepository extends JpaRepository<Car, Integer> {
}
