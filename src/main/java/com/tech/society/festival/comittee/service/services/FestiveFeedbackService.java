package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveFeedback;

import java.util.List;

public interface FestiveFeedbackService {
    FestiveFeedback create(FestiveFeedback feedback);

    List<FestiveFeedback> getByOccasionId(String occasionId);

    List<FestiveFeedback> getByResidentId(String residentId);
}
