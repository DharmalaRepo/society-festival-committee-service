package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document(collection = "festive_events")
public class FestiveEvent {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String societyId;
    private String eventName;
    private ZonedDateTime eventDate;
    private String venue;
    private String description;
    private List<String> poc; // List of resident IDs
}