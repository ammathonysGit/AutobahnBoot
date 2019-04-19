package com.scalefocus.tracker.tracker.services;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.exceptions.NoSuchUserFoundException;
import com.scalefocus.tracker.tracker.exceptions.NoUsersFoundException;
import com.scalefocus.tracker.tracker.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    @Autowired
    public UserServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }


    @Override
    public User findUserByUserName(String username) {
      return  usersRepository.findByUsername(username).get();
    }

    @Override
    public User findUserById(Integer id) {
        return null;
    }

    @Override
    public void saveUser(User user) {
        usersRepository.saveAndFlush(user);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void deleteUserAdmin(User user) {

    }

    @Override
    public void deleteAllUsersAdmin() {

    }

    @Override
    public List<User> getAllUsers() {
        List <User> listOfUsers = usersRepository.findAll();

        if (listOfUsers == null){
            throw new NoUsersFoundException("No Users Found", new Throwable().getCause());
        }

        return listOfUsers;
    }
}
