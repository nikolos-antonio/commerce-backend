package com.justiceleague.commercesystem.repository;

import com.justiceleague.commercesystem.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
    @Query(value = "SELECT * FROM reservation WHERE user_id = :id", nativeQuery = true)
    List<Reservation> getReservationsByUserId(@Param("id") Integer id);
}
