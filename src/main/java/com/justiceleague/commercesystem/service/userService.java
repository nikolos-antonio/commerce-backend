package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.users;

import java.util.List;

public interface userService {
    public users saveUser(users user);
    public List<users> getAllUsers();
    List<users> getUserById(Integer id);
}
