package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveFundContribution;

import java.util.List;

public interface FestiveFundContributionService {
    FestiveFundContribution create(FestiveFundContribution contribution);

    List<FestiveFundContribution> getByOccasionId(String occasionId);

    List<FestiveFundContribution> getByResidentId(String residentId);
}
