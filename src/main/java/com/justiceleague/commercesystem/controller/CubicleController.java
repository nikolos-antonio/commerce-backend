package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.Cubicle;
import com.justiceleague.commercesystem.service.CubicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.ZoneId;
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
        LocalDate currentDate = LocalDate.now();
        Date currentDatePlusThreeMonths = Date.from(currentDate.plusMonths(3).atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date currentDatePlusSixMonths = Date.from(currentDate.plusMonths(6).atStartOfDay(ZoneId.systemDefault()).toInstant());

        if (start_date.after(currentDatePlusThreeMonths)) {
            throw new IllegalArgumentException("Start date can not be farther than 3 months in advance");
        } else if (end_date.after(currentDatePlusSixMonths)){
            throw new IllegalArgumentException("End date can not be farther than 6 months in advance");
        } else {
            return cubicleService.getAvailableCubicles(start_date, end_date);
        }
    }
}
