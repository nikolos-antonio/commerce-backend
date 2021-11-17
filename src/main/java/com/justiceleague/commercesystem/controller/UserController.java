package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Reservation;
import com.justiceleague.commercesystem.model.User;
import com.justiceleague.commercesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public void addUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") Integer id) {
        return userService.getUser(id);
    }

    @PostMapping("/auth")
    public User auth(@RequestBody User user) {
        User oauthUser = userService.login(user.getEmail(), user.getPassword());

        if(Objects.nonNull(oauthUser)){
            return oauthUser;
        } else {
            throw new IllegalArgumentException("No user with that email and password");
        }
    }

}
