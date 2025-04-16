package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveCommittee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveCommitteeRepository extends MongoRepository<FestiveCommittee, String> {
    List<FestiveCommittee> findBySocietyId(String societyId);
    FestiveCommittee findByCustomId(int customId);
}