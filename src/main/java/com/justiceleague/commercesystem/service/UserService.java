package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.User;
import com.justiceleague.commercesystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }
}
