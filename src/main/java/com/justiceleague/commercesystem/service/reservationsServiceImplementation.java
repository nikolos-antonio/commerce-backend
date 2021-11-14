package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.reservations;
import com.justiceleague.commercesystem.repository.reservationsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class reservationsServiceImplementation implements reservationsService {

    @Autowired
    private reservationsRepo reservationRepo;

    @Override
    public List<reservations> getAllReservations() {
        return reservationRepo.findAll();
    }
}
