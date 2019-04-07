package com.scalefocus.tracker.tracker.controllers;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/users")
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping(value = "/all")
    public List<User> getUsers(){
         return usersRepository.findAll();
    }

    @PostMapping(value = "/save")
    public List<User> persistUser(@RequestBody User user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }

}
