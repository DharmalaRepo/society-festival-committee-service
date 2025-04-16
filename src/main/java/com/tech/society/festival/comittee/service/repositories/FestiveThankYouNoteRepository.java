package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveThankYouNote;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveThankYouNoteRepository extends MongoRepository<FestiveThankYouNote, String> {
    List<FestiveThankYouNote> findByOccasionId(String occasionId);
}