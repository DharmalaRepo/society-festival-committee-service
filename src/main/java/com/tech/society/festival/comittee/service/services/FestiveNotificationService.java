package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveNotification;

import java.util.List;

public interface FestiveNotificationService {
    FestiveNotification create(FestiveNotification notification);

    List<FestiveNotification> getByOccasionId(String occasionId);
}
