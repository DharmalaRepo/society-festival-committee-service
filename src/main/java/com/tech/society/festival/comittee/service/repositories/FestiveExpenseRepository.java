package com.tech.society.festival.comittee.service.repositories;

import com.tech.society.festival.comittee.service.models.FestiveExpense;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FestiveExpenseRepository extends MongoRepository<FestiveExpense, String> {
    List<FestiveExpense> findByOccasionId(String occasionId);
}