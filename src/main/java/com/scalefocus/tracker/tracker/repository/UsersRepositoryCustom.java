package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.exceptions.NoSuchUserFoundException;
import com.scalefocus.tracker.tracker.exceptions.NoUsersFoundException;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class UsersRepositoryCustom implements UsersRepository {

    @Autowired
    UsersRepository usersRepository;

    public User findUserByUsername(String userName) {
        List<User> listOfUsers = usersRepository.findAll();
        User userToReturn = null;

        if (listOfUsers == null) {
            throw new NoUsersFoundException("No Users Found", new Throwable().getCause());
        }

        for (User user: listOfUsers) {
            if (user.getUsername().equals(userName)) {
                userToReturn = user;
                break;
            }
        }

        if (userToReturn == null) {
            throw new NoSuchUserFoundException("No Such User Found", new Throwable().getCause());
        }

        return userToReturn;
    }

}
