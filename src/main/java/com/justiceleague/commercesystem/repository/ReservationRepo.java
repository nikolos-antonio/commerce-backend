package com.justiceleague.commercesystem.repository;

import com.justiceleague.commercesystem.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
    @Query(value = "SELECT * FROM reservation WHERE reservation.user_id = :id", nativeQuery = true)
    List<Reservation> getReservationsByUserId(@Param("id") Integer id);

    @Query(value = "INSERT INTO reservations(cubicle_id, user_id, start_date, end_date) VALUES (:cubicle_id, :user_id, :start_date, :end_date);", nativeQuery = true)
    ResponseEntity<Reservation> insertReservation(@Param("cubicle_id") String cubicle_id, @Param("user_id") String user_id, @Param("start_date") String start_date, @Param("end_date") String end_date);
}
