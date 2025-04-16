package com.tech.society.festival.comittee.service.controllers;

import com.tech.society.festival.comittee.service.models.FestivePoll;
import com.tech.society.festival.comittee.service.services.FestivePollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-polls")
public class FestivePollController {

    @Autowired
    private FestivePollService pollService;

    @PostMapping
    public FestivePoll createPoll(@RequestBody FestivePoll poll) {
        return pollService.create(poll);
    }

    @PutMapping
    public FestivePoll updatePoll(@RequestBody FestivePoll poll) {
        return pollService.update(poll);
    }

    @DeleteMapping("/{id}")
    public boolean deletePoll(@PathVariable String id) {
        return pollService.delete(id);
    }

    @GetMapping("/{id}")
    public FestivePoll getPollById(@PathVariable String id) {
        return pollService.getById(id);
    }

    @GetMapping("/society/{societyId}")
    public List<FestivePoll> getPollsBySocietyId(@PathVariable String societyId) {
        return pollService.getBySocietyId(societyId);
    }

    @GetMapping("/occasion/{occasionId}")
    public List<FestivePoll> getPollsByOccasionId(@PathVariable String occasionId) {
        return pollService.getByOccasionId(occasionId);
    }
}