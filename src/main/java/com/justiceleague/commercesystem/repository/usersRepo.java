package com.justiceleague.commercesystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justiceleague.commercesystem.model.users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface usersRepo extends JpaRepository<users, Integer> {

    @Query(value = "SELECT * FROM users WHERE id = :id", nativeQuery = true)
    List<users> getUserById(@Param("id") Integer id);
}
