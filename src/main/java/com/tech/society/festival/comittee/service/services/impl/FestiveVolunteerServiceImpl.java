package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveVolunteer;
import com.tech.society.festival.comittee.service.repositories.FestiveVolunteerRepository;
import com.tech.society.festival.comittee.service.services.FestiveVolunteerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveVolunteerServiceImpl implements FestiveVolunteerService {

    @Autowired
    private FestiveVolunteerRepository repository;

    @Override
    public FestiveVolunteer create(FestiveVolunteer volunteer) {
        return repository.save(volunteer);
    }

    @Override
    public List<FestiveVolunteer> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }

    @Override
    public List<FestiveVolunteer> getByResidentId(String residentId) {
        return repository.findByResidentId(residentId);
    }
}