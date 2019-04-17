package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.Rim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RimsRepository extends JpaRepository<Rim, Integer> {
}
