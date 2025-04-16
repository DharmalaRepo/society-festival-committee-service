package com.tech.society.festival.comittee.service.controller;

import com.tech.society.festival.comittee.service.models.FestivePollVote;
import com.tech.society.festival.comittee.service.services.FestivePollVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/festive-poll-votes")
public class FestivePollVoteController {

    @Autowired
    private FestivePollVoteService voteService;

    @PostMapping
    public FestivePollVote createVote(@RequestBody FestivePollVote vote) {
        return voteService.create(vote);
    }

    @GetMapping("/poll/{pollId}")
    public List<FestivePollVote> getVotesByPollId(@PathVariable long pollId) {
        return voteService.getByPollId(pollId);
    }

    @GetMapping("/resident/{residentId}")
    public List<FestivePollVote> getVotesByResidentId(@PathVariable String residentId) {
        return voteService.getByResidentId(residentId);
    }
}