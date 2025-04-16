package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveVolunteer;
import com.tech.society.festival.comittee.service.services.FestiveVolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-volunteers")
public class FestiveVolunteerController {

    @Autowired
    private FestiveVolunteerService service;

    @PostMapping
    public FestiveVolunteer create(@RequestBody FestiveVolunteer volunteer) {
        return service.create(volunteer);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveVolunteer> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }

    @GetMapping("/resident/{residentId}")
    public List<FestiveVolunteer> getByResidentId(@PathVariable String residentId) {
        return service.getByResidentId(residentId);
    }
}