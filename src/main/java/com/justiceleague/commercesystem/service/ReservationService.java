package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.Reservation;
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
}
