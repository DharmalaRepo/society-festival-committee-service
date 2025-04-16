package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveFeedback;
import com.tech.society.festival.comittee.service.services.FestiveFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-feedbacks")
public class FestiveFeedbackController {

    @Autowired
    private FestiveFeedbackService service;

    @PostMapping
    public FestiveFeedback create(@RequestBody FestiveFeedback feedback) {
        return service.create(feedback);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveFeedback> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }

    @GetMapping("/resident/{residentId}")
    public List<FestiveFeedback> getByResidentId(@PathVariable String residentId) {
        return service.getByResidentId(residentId);
    }
}