package com.scalefocus.tracker.tracker.controllers;


import com.scalefocus.tracker.tracker.constants.LoginConstant;
import com.scalefocus.tracker.tracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }


    @RequestMapping(LoginConstant.LOGIN_URL)
    public ModelAndView modelAndView(ModelAndView modelAndView) {
        modelAndView.setViewName("login");

        return modelAndView;
    }

}
