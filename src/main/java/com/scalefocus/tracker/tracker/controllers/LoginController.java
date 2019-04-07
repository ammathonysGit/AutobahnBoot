package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.constants.LoginConstant;
import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.model.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = LoginConstant.LOGIN_URL)
public class LoginController {

    @Autowired
    UsersService usersService;

    @RequestMapping("")
    public ModelAndView modelAndView() {
        return new ModelAndView("login");
    }

}
