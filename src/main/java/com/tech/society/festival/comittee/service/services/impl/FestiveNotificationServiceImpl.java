package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveNotification;
import com.tech.society.festival.comittee.service.repositories.FestiveNotificationRepository;
import com.tech.society.festival.comittee.service.services.FestiveNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveNotificationServiceImpl implements FestiveNotificationService {

    @Autowired
    private FestiveNotificationRepository repository;

    @Override
    public FestiveNotification create(FestiveNotification notification) {
        return repository.save(notification);
    }

    @Override
    public List<FestiveNotification> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }
}