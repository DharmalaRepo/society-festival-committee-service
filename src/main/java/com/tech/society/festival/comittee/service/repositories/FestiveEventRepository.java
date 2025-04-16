package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveEvent;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveEventRepository extends MongoRepository<FestiveEvent, String> {
    List<FestiveEvent> findByOccasionId(String occasionId);
}