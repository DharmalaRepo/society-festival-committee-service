package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestivePoll;

import java.util.List;

public interface FestivePollService {
    FestivePoll create(FestivePoll poll);
    FestivePoll update(FestivePoll poll);
    boolean delete(String id);
    FestivePoll getById(String id);
    List<FestivePoll> getBySocietyId(String societyId);
    List<FestivePoll> getByOccasionId(String occasionId);
}