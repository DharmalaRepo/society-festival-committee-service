package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestivePrize;

import java.util.List;

public interface FestivePrizeService {
    FestivePrize create(FestivePrize prize);

    List<FestivePrize> getByOccasionId(String occasionId);
}
