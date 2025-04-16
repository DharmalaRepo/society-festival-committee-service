package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "festive_prizes")
public class FestivePrize {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String eventId;
    private String committeeId;
    private String societyId;
    private String winnerResidentId;
    private String prize;
    private String position; // 1st, 2nd, etc.
}