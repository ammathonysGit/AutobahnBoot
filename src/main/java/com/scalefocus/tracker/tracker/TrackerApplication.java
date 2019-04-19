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
	}

}
