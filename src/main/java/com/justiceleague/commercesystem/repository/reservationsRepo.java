package com.justiceleague.commercesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.reservations;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface reservationsRepo extends JpaRepository<reservations, Integer> {

}
