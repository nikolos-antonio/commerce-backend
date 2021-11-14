package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.users;
import com.justiceleague.commercesystem.repository.usersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImplementation implements userService {

    @Autowired
    private usersRepo userRepo;

    @Override
    public users saveUser(users user) {
        return userRepo.save(user);
    }

    @Override
    public List<users> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public List<users> getUserById(Integer id) {
        return userRepo.getUserById(id);
    }
}
