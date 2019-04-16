package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.constants.HomeConstant;
import com.scalefocus.tracker.tracker.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String applicationName;
    private CarService carService;

    @Autowired
    public HomeController(CarService carService) {
        this.carService = carService;
    }

    @RequestMapping(HomeConstant.INDEX_URL)
    public ModelAndView welcomePage(ModelAndView model) {
        model.setViewName("index");
        model.addObject("appName", applicationName);
        model.addObject("carsTierOne", carService.getAllCars().subList(0,4));
        model.addObject("carsTierTwo", carService.getAllCars().subList(4,8));

        return model;
    }

//    @GetMapping(HomeConstant.HOME_URL)
//    public ModelAndView homePage() {
//        ModelAndView modelAndView = new ModelAndView("home");
//
//        modelAndView.addObject("appName", applicationName);
//
//        return modelAndView;
//    }


}
