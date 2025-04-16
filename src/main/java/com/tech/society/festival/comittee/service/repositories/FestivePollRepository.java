package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestivePoll;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestivePollRepository extends MongoRepository<FestivePoll, String> {

    FestivePoll findByCustomId(long customId);
    List<FestivePoll> findBySocietyId(String societyId);
    List<FestivePoll> findByOccasionId(String occasionId);
    List<FestivePoll> findByIsActive(int isActive);
    List<FestivePoll> findByPollType(String pollType);
    void deleteByCustomId(long customId);
}