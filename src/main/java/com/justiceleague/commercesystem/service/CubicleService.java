package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.Cubicle;
import com.justiceleague.commercesystem.repository.CubicleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CubicleService {
    @Autowired
    private CubicleRepo cubicleRepo;

    public List<Cubicle> getAllCubicles() {
        return cubicleRepo.findAll();
    }

    public Cubicle getCubicleById(Integer id) {return cubicleRepo.getCubicleById(id);}

    public List<Cubicle> getAvailableCubicles(Date start_date, Date end_date) {return cubicleRepo.getAvailableCubicles(start_date, end_date);}
}
