package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.Reservation;
import com.justiceleague.commercesystem.model.User;
import com.justiceleague.commercesystem.repository.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    public List<Reservation> getUserReservations(Integer id) {
        return reservationRepo.getReservationsByUserId(id);
    }

    public Reservation saveReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    public void deleteReservation(Integer id) {
        reservationRepo.deleteById(id);
    }
}
