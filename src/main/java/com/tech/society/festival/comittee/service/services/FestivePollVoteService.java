package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestivePollVote;

import java.util.List;

public interface FestivePollVoteService {
    FestivePollVote create(FestivePollVote vote);
    List<FestivePollVote> getByPollId(long pollId);
    List<FestivePollVote> getByResidentId(String residentId);
}