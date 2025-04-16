package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "festive_feedbacks")
public class FestiveFeedback {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String societyId;
    private String residentId;
    private String feedbackText;
    private double rating;
    private ZonedDateTime submittedDate;
}