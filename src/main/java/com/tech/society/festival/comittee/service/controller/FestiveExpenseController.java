package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveExpense;
import com.tech.society.festival.comittee.service.services.FestiveExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-expenses")
public class FestiveExpenseController {

    @Autowired
    private FestiveExpenseService service;

    @PostMapping
    public FestiveExpense create(@RequestBody FestiveExpense expense) {
        return service.create(expense);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveExpense> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }
}