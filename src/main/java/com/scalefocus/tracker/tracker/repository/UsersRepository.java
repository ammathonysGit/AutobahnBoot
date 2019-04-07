package com.scalefocus.tracker.tracker.repository;

import com.scalefocus.tracker.tracker.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
}
