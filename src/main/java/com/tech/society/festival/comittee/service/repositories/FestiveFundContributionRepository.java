package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveFundContribution;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveFundContributionRepository extends MongoRepository<FestiveFundContribution, String> {
    List<FestiveFundContribution> findByOccasionId(String occasionId);
    List<FestiveFundContribution> findByResidentId(String residentId);
}