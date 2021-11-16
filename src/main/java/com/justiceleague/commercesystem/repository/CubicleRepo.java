package com.justiceleague.commercesystem.repository;

import com.justiceleague.commercesystem.model.Cubicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CubicleRepo extends JpaRepository<Cubicle, Integer> {

    @Query(value = "SELECT * FROM cubicle where cubicle.id = :id", nativeQuery = true)
    Cubicle getCubicleById(@Param("id") Integer id);

    @Query(value = "SELECT * FROM cubicle WHERE cubicle.id not in (SELECT cubicle_id FROM reservation WHERE :start_date <= reservation.end_date AND :end_date >= reservation.start_date", nativeQuery = true)
    List<Cubicle> getAvailableCubicles(@Param("start_date") Date start_date, @Param("end_date") Date end_date);
}
