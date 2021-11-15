package com.justiceleague.commercesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.Cubicle;
import org.springframework.stereotype.Repository;

@Repository
public interface CubicleRepo extends JpaRepository<Cubicle, Integer> {
}
