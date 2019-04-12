package com.scalefocus.tracker.tracker.controllers;


import com.scalefocus.tracker.tracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;

//@Controller
//@RequestMapping(value = LoginConstant.LOGIN_URL)
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }


//    @RequestMapping("")
//    public ModelAndView modelAndView() {
//        return new ModelAndView("login");
//    }

}
