package com.justiceleague.commercesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.justiceleague;
import org.springframework.stereotype.Repository;

@Repository
public interface justiceleaugeRepository extends JpaRepository<justiceleague, Integer> {

}
