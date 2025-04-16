package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveEvent;
import com.tech.society.festival.comittee.service.services.FestiveEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-events")
public class FestiveEventController {

    @Autowired
    private FestiveEventService service;

    @PostMapping
    public FestiveEvent create(@RequestBody FestiveEvent event) {
        return service.create(event);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveEvent> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }
}