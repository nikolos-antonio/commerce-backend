package com.justiceleague.commercesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Integer> {
}
