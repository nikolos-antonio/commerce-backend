package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Reservation;
import com.justiceleague.commercesystem.model.ReservationInsertionRequest;
import com.justiceleague.commercesystem.service.CubicleService;
import com.justiceleague.commercesystem.service.ReservationService;
import com.justiceleague.commercesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Date;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;

@RestController
@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @Autowired
    private UserService userService;

    @Autowired
    private CubicleService cubicleService;

    @GetMapping("/")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/user/{id}")
    public List<Reservation> getUserReservations(@PathVariable("id") Integer id) {
        return reservationService.getUserReservations(id);
    }

    @PostMapping(value = "/",
    consumes = {
            MediaType.APPLICATION_JSON_VALUE
    },
    produces = {
            MediaType.APPLICATION_JSON_VALUE
    })
    public void saveReservation(@RequestBody ReservationInsertionRequest reservationInsertionRequest) {

        Reservation reservation = new Reservation();
        reservation.setUser(userService.getUser(reservationInsertionRequest.getUser_id()));
        reservation.setCubicle(cubicleService.getCubicleById(reservationInsertionRequest.getCubicle_id()));
        reservation.setStart_date(reservationInsertionRequest.getStart_date());
        reservation.setEnd_date(reservationInsertionRequest.getEnd_date());

        reservationService.saveReservation(reservation);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable("id") Integer id) {
        reservationService.deleteReservation(id);
    }

}
