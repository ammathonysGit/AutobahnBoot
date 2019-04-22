package com.scalefocus.tracker.tracker.controllers;


import com.scalefocus.tracker.tracker.constants.AccountConstants;
import com.scalefocus.tracker.tracker.mappers.UserMapper;
import com.scalefocus.tracker.tracker.model.bindingmodels.AccountBindingModel;
import com.scalefocus.tracker.tracker.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {

    private UserService userService;


    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }



    @RequestMapping(AccountConstants.CREATE_ACCOUNT_FORM_URL)
    public ModelAndView getRegistrationForm(ModelAndView modelAndView) {
        modelAndView.setViewName("createAccount");
        modelAndView.addObject("user", new AccountBindingModel());

        return modelAndView;
    }


    @PostMapping("/")
    public ModelAndView registration(@ModelAttribute AccountBindingModel accountBindingModel, ModelAndView modelAndView) {
        System.out.println(accountBindingModel.getUsername());
        System.out.println(accountBindingModel.getPassword());
        System.out.println(accountBindingModel.getRepeat());

        userService.saveUser(accountBindingModel);

        modelAndView.setViewName("login");

        return modelAndView;
    }
}
