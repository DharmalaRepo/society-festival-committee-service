package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveExpense;

import java.util.List;

public interface FestiveExpenseService {
    FestiveExpense create(FestiveExpense expense);

    List<FestiveExpense> getByOccasionId(String occasionId);
}
