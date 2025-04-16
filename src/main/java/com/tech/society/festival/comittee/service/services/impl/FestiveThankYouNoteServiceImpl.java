package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveThankYouNote;
import com.tech.society.festival.comittee.service.repositories.FestiveThankYouNoteRepository;
import com.tech.society.festival.comittee.service.services.FestiveThankYouNoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveThankYouNoteServiceImpl implements FestiveThankYouNoteService {

    @Autowired
    private FestiveThankYouNoteRepository repository;

    @Override
    public FestiveThankYouNote create(FestiveThankYouNote note) {
        return repository.save(note);
    }

    @Override
    public List<FestiveThankYouNote> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }
}