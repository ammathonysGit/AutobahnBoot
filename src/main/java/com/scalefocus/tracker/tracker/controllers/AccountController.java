package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.constants.AccountConstants;
import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping(value = AccountConstants.CREATE_ACCOUNT_FORM_URL)
public class AccountController {

    @Autowired
    UsersRepository usersRepository;


    //CreateAccountForm
    @GetMapping("")
    public ModelAndView createAccountFormView() {
        ModelAndView modelAndView = new ModelAndView("createAccount");
        modelAndView.addObject("user", new User());
        return modelAndView;
    }

    @PostMapping("createAccount")
    public ModelAndView CreateAccount(@Valid User user, BindingResult bindingResult){
        System.out.println("User with username :" + user.getUsername());
        usersRepository.save(user);

        ModelAndView modelAndView = new ModelAndView("thankYou");
        modelAndView.addObject("userAccount", user);
        return modelAndView;

    }

}
