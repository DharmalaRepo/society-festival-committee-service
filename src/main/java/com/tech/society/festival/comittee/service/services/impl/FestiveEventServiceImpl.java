package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveEvent;
import com.tech.society.festival.comittee.service.repositories.FestiveEventRepository;
import com.tech.society.festival.comittee.service.services.FestiveEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveEventServiceImpl implements FestiveEventService {

    @Autowired
    private FestiveEventRepository repository;

    @Override
    public FestiveEvent create(FestiveEvent event) {
        return repository.save(event);
    }

    @Override
    public List<FestiveEvent> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }
}