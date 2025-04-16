package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveFeedback;
import com.tech.society.festival.comittee.service.repositories.FestiveFeedbackRepository;
import com.tech.society.festival.comittee.service.services.FestiveFeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveFeedbackServiceImpl implements FestiveFeedbackService {

    @Autowired
    private FestiveFeedbackRepository repository;

    @Override
    public FestiveFeedback create(FestiveFeedback feedback) {
        return repository.save(feedback);
    }

    @Override
    public List<FestiveFeedback> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }

    @Override
    public List<FestiveFeedback> getByResidentId(String residentId) {
        return repository.findByResidentId(residentId);
    }
}