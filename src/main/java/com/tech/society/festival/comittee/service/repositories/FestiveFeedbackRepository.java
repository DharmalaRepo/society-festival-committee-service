package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveFeedback;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveFeedbackRepository extends MongoRepository<FestiveFeedback, String> {
    List<FestiveFeedback> findByOccasionId(String occasionId);
    List<FestiveFeedback> findByResidentId(String residentId);
}