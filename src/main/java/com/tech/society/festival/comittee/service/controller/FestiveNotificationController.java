package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveNotification;
import com.tech.society.festival.comittee.service.services.FestiveNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-notifications")
public class FestiveNotificationController {

    @Autowired
    private FestiveNotificationService service;

    @PostMapping
    public FestiveNotification create(@RequestBody FestiveNotification notification) {
        return service.create(notification);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveNotification> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }
}