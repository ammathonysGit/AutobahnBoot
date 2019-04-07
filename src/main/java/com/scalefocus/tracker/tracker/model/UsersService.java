package com.scalefocus.tracker.tracker.model;

import com.scalefocus.tracker.tracker.entity.User;
import com.scalefocus.tracker.tracker.exceptions.NoUsersFoundException;
import com.scalefocus.tracker.tracker.repository.UsersRepository;
import com.scalefocus.tracker.tracker.repository.UsersRepositoryCustom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository usersRepository;

    @Autowired
    UsersRepositoryCustom usersRepositoryCustom;


    public List<User> getAllUsers() {
        List <User> listOfUsers = usersRepository.findAll();

        if (listOfUsers == null){
        throw new NoUsersFoundException("No Users Found", new Throwable().getCause());
        }

        return listOfUsers;
    }

    public User findUserByUserName(String userName) {
      return usersRepositoryCustom.findUserByUsername(userName);
    }

    public User findUserById(Integer id) {
       return usersRepository.findById(id).get();
    }

    public void saveUser(User user) {
        usersRepository.save(user);
    }

    public void updateUser(User user) {
        usersRepository.save(user);
    }

    public void deleteUserAdmin(User user) {
        usersRepository.delete(user);
    }

    public void deleteAllUsersAdmin(){
        usersRepository.deleteAll();
    }

}
