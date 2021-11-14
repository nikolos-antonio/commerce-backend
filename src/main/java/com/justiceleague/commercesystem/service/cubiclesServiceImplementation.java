package com.justiceleague.commercesystem.service;

import com.justiceleague.commercesystem.model.cubicles;
import com.justiceleague.commercesystem.repository.cubiclesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class cubiclesServiceImplementation implements cubiclesService {

    @Autowired
    private cubiclesRepo cubicleRepo;

    @Override
    public List<cubicles> getAllCubicles() {
        return cubicleRepo.findAll();
    }

}
