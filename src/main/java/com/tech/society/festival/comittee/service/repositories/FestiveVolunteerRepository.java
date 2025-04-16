package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveVolunteer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveVolunteerRepository extends MongoRepository<FestiveVolunteer, String> {
    List<FestiveVolunteer> findByOccasionId(String occasionId);
    List<FestiveVolunteer> findByResidentId(String residentId);
}