package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveNotification;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveNotificationRepository extends MongoRepository<FestiveNotification, String> {
    List<FestiveNotification> findByOccasionId(String occasionId);
}