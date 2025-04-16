package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveFundContribution;
import com.tech.society.festival.comittee.service.repositories.FestiveFundContributionRepository;
import com.tech.society.festival.comittee.service.services.FestiveFundContributionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveFundContributionServiceImpl implements FestiveFundContributionService {

    @Autowired
    private FestiveFundContributionRepository repository;

    @Override
    public FestiveFundContribution create(FestiveFundContribution contribution) {
        return repository.save(contribution);
    }

    @Override
    public List<FestiveFundContribution> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }

    @Override
    public List<FestiveFundContribution> getByResidentId(String residentId) {
        return repository.findByResidentId(residentId);
    }
}