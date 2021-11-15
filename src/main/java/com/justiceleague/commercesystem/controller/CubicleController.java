package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Cubicle;
import com.justiceleague.commercesystem.service.CubicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cubicles")
public class CubicleController {

    @Autowired
    private CubicleService cubicleService;

    @GetMapping("/")
    public List<Cubicle> getAllCubicles() {
        return cubicleService.getAllCubicles();
    }
}
