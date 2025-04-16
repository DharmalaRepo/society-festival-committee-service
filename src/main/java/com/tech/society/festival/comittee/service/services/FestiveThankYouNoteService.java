package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveThankYouNote;

import java.util.List;

public interface FestiveThankYouNoteService {
    FestiveThankYouNote create(FestiveThankYouNote note);

    List<FestiveThankYouNote> getByOccasionId(String occasionId);
}
