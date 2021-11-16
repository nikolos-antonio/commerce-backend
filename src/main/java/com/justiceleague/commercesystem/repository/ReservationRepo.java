package com.justiceleague.commercesystem.repository;

import com.justiceleague.commercesystem.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
    @Query(value = "SELECT * FROM reservation WHERE reservation.user_id = :id", nativeQuery = true)
    List<Reservation> getReservationsByUserId(@Param("id") Integer id);
}
