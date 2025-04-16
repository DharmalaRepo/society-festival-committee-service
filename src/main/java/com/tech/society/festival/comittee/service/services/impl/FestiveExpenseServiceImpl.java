package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveExpense;
import com.tech.society.festival.comittee.service.repositories.FestiveExpenseRepository;
import com.tech.society.festival.comittee.service.services.FestiveExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveExpenseServiceImpl implements FestiveExpenseService {

    @Autowired
    private FestiveExpenseRepository repository;

    @Override
    public FestiveExpense create(FestiveExpense expense) {
        return repository.save(expense);
    }

    @Override
    public List<FestiveExpense> getByOccasionId(String occasionId) {
        return repository.findByOccasionId(occasionId);
    }
}