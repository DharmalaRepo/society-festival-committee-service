package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveEvent;

import java.util.List;

public interface FestiveEventService {
    FestiveEvent create(FestiveEvent event);

    List<FestiveEvent> getByOccasionId(String occasionId);
}
