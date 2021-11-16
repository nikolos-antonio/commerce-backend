package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Reservation;
import com.justiceleague.commercesystem.model.User;
import com.justiceleague.commercesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/{id}/reservations")
    public List<Reservation> getUserReservations(@PathVariable("id") Integer id) {
        return userService.getUserReservations(id);
    }

}
