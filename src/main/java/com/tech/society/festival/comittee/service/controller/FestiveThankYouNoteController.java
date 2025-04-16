package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestiveThankYouNote;
import com.tech.society.festival.comittee.service.services.FestiveThankYouNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-thankyou-notes")
public class FestiveThankYouNoteController {

    @Autowired
    private FestiveThankYouNoteService service;

    @PostMapping
    public FestiveThankYouNote create(@RequestBody FestiveThankYouNote note) {
        return service.create(note);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestiveThankYouNote> getByOccasionId(@PathVariable String occasionId) {
        return service.getByOccasionId(occasionId);
    }
}