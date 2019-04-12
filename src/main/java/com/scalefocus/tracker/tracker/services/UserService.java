package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    public List<User> getAllUsers();

    public User findUserByUserName(String username);

    public User findUserById(Integer id);

    public void saveUser(User user);

    public void updateUser(User user);

    public void deleteUserAdmin(User user);

    public void deleteAllUsersAdmin();

}
