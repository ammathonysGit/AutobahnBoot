package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<Car, Integer> {
}
