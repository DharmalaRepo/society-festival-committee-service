package com.tech.society.festival.comittee.service.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.ZonedDateTime;

@Data
@Document(collection = "festive_expenses")
public class FestiveExpense {
    @Id
    private String id;
    private int customId;
    private String occasionId;
    private String committeeId;
    private String societyId;
    private String category; // Decoration, Food, Sound, etc.
    private double amount;
    private String paidTo;
    private String paidBy;
    private ZonedDateTime paymentDate;
    private String notes;
}