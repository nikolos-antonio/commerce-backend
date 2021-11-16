package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.Reservation;
import com.justiceleague.commercesystem.model.User;
import com.justiceleague.commercesystem.repository.UserRepo;
import com.justiceleague.commercesystem.repository.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ReservationRepo reservationRepo;

    public User saveUser(User user) {
        return userRepo.save(user);
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(Integer id) {
        return userRepo.findById(id).get();
    }

    public List<Reservation> getUserReservations(Integer id) {
        return userRepo.getReservationsByUserId(id);
    }
}
