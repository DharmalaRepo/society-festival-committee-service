package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestivePollVote;
import com.tech.society.festival.comittee.service.repositories.FestivePollVoteRepository;
import com.tech.society.festival.comittee.service.services.FestivePollVoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class FestivePollVoteServiceImpl implements FestivePollVoteService {

    @Autowired
    private FestivePollVoteRepository voteRepository;

    @Override
    public FestivePollVote create(FestivePollVote vote) {
        vote.setCreatedDate(new Date());
        return voteRepository.save(vote);
    }

    @Override
    public List<FestivePollVote> getByPollId(long pollId) {
        return voteRepository.findByPollId(pollId);
    }

    @Override
    public List<FestivePollVote> getByResidentId(String residentId) {
        return voteRepository.findByResidentId(residentId);
    }
}