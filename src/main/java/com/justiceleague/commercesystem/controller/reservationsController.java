package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.reservations;
import com.justiceleague.commercesystem.service.reservationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservations")
public class reservationsController {

    @Autowired
    private reservationsService reservationService;

    @GetMapping("/")
    public List<reservations> getAllReservations() {
        return reservationService.getAllReservations();
    }
}
