package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.users;
import com.justiceleague.commercesystem.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class usersController {

    @Autowired
    private userService userService;

    @PostMapping("/")
    public String add(@RequestBody users user){
        userService.saveUser(user);
        return "New user is added";
    }

    @GetMapping("/")
    public List<users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/id/{user_id}")
    public List<users> getUserById(@PathVariable("user_id") Integer id) {
        return userService.getUserById(id);
    }

}
