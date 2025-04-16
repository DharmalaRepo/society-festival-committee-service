package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestivePrize;
import com.tech.society.festival.comittee.service.repositories.FestivePrizeRepository;
import com.tech.society.festival.comittee.service.services.FestivePrizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivePrizeServiceImpl implements FestivePrizeService {

    @Autowired
    private FestivePrizeRepository repository;

    @Override
    public FestivePrize create(FestivePrize prize) {
        return repository.save(prize);
    }

    @Override
    public List<FestivePrize> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }
}