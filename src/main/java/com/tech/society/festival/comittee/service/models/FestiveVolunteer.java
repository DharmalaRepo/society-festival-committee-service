package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "festive_volunteers")
public class FestiveVolunteer {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String residentId;
    private String role;
    private String societyId;
    private ZonedDateTime joinedDate;
    private boolean isActive;
}