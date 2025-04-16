package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestivePollVote;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FestivePollVoteRepository extends MongoRepository<FestivePollVote, String> {

    FestivePollVote findByCustomId(long customId);
    List<FestivePollVote> findByPollId(long pollId);
    List<FestivePollVote> findBySocietyId(String societyId);
    List<FestivePollVote> findByOccasionId(String occasionId);
    List<FestivePollVote> findByResidentId(String residentId);
    List<FestivePollVote> findByStatus(String status);
    void deleteByCustomId(long customId);
}