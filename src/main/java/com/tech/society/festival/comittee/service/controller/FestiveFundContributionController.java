package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveFundContribution;
import com.tech.society.festival.comittee.service.services.FestiveFundContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-fund-contributions")
public class FestiveFundContributionController {

    @Autowired
    private FestiveFundContributionService service;

    @PostMapping
    public FestiveFundContribution create(@RequestBody FestiveFundContribution contribution) {
        return service.create(contribution);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveFundContribution> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }

    @GetMapping("/resident/{residentId}")
    public List<FestiveFundContribution> getByResidentId(@PathVariable String residentId) {
        return service.getByResidentId(residentId);
    }
}