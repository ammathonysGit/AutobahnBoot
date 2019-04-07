package com.scalefocus.tracker.tracker.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @Value("${spring.application.name}")
    String applicationName;

    @GetMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", applicationName);

        return "index";
    }

}
