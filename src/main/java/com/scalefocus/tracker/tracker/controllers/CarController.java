package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.constants.CarConstants;

import com.scalefocus.tracker.tracker.model.bindingmodels.CarBindingModel;
import com.scalefocus.tracker.tracker.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CarController {


    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(CarConstants.CAR_ADD_FORM)
    public ModelAndView getCarsSearchForm(ModelAndView modelAndView) {
        modelAndView.addObject("carBind", new CarBindingModel());
        modelAndView.setViewName("carsSearchForm");

        return modelAndView;
    }


    @PostMapping(CarConstants.CAR_SAVED_FORM)
    public ModelAndView getRequiredCarsFromTheSearchForm(@ModelAttribute CarBindingModel carBindingModel, ModelAndView modelAndView) {
        carService.saveCar(carBindingModel);
        System.out.println("Successfully saved :"  +carBindingModel.toString());
        modelAndView.setViewName("home");
        return modelAndView;
    }

}
