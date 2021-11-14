package com.justiceleague.commercesystem.controller;

import com.justiceleague.commercesystem.model.cubicles;
import com.justiceleague.commercesystem.service.cubiclesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cubicles")
public class cubiclesController {

    @Autowired
    private cubiclesService cubiclesService;

    @GetMapping("/")
    public List<cubicles> getAllCubicles() {
        return cubiclesService.getAllCubicles();
    }
}
