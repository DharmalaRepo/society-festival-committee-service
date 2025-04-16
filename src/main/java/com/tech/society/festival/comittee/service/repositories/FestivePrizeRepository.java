package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestivePrize;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestivePrizeRepository extends MongoRepository<FestivePrize, String> {
    List<FestivePrize> findByOccasionId(String occasionId);
}