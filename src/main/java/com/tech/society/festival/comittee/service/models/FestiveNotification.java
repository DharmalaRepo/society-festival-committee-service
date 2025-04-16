package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "festive_notifications")
public class FestiveNotification {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String societyId;
    private String target; // AllResidents, Volunteers, Association
    private String type;   // Event Invite, Reminder, Thanks, Info
    private String message;
    private String sentBy;
    private ZonedDateTime sentDate;
}