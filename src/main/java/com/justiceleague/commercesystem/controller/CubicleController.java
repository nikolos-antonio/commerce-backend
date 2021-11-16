package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Cubicle;
import com.justiceleague.commercesystem.service.CubicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
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

    @GetMapping("/{id}")
    public Cubicle getCubicleById(@PathVariable("id") Integer id){
        return cubicleService.getCubicleById(id);
    }

    @GetMapping("/available/{start_date}/{end_date}")
    public List<Cubicle> getAvailableCubicles(@PathVariable("start_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date start_date, @PathVariable("end_date") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date end_date) {
        return cubicleService.getAvailableCubicles(start_date, end_date);
    }
}
