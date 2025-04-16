package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestiveCommittee;
import com.tech.society.festival.comittee.service.repositories.FestiveCommitteeRepository;
import com.tech.society.festival.comittee.service.services.FestiveCommitteeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestiveCommitteeServiceImpl implements FestiveCommitteeService {

    @Autowired
    private FestiveCommitteeRepository repository;

    @Override
    public FestiveCommittee create(FestiveCommittee committee) {
        return repository.save(committee);
    }

    @Override
    public FestiveCommittee update(FestiveCommittee committee) {
        return repository.save(committee);
    }

    @Override
    public boolean delete(String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public FestiveCommittee getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<FestiveCommittee> getBySocietyId(String societyId) {
        return repository.findBySocietyId(societyId);
    }
}