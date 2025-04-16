package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestivePrize;
import com.tech.society.festival.comittee.service.services.FestivePrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-prizes")
public class FestivePrizeController {

    @Autowired
    private FestivePrizeService service;

    @PostMapping
    public FestivePrize create(@RequestBody FestivePrize prize) {
        return service.create(prize);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestivePrize> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }
}