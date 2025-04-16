package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "festive_fund_contributions")
public class FestiveFundContribution {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String residentId;
    private String societyId;
    private double amount;
    private String paymentMode; // UPI, Cash, etc.
    private ZonedDateTime paymentDate;
    private boolean confirmed;
}