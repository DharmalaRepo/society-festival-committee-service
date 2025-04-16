package com.tech.society.festival.comittee.service.services.impl;

import com.tech.society.festival.comittee.service.models.FestivePoll;
import com.tech.society.festival.comittee.service.repositories.FestivePollRepository;
import com.tech.society.festival.comittee.service.services.FestivePollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class FestivePollServiceImpl implements FestivePollService {

    @Autowired
    private FestivePollRepository pollRepository;

    @Override
    public FestivePoll create(FestivePoll poll) {
        poll.setCreatedDate(new Date());
        return pollRepository.save(poll);
    }

    @Override
    public FestivePoll update(FestivePoll poll) {
        poll.setModifiedDate(new Date());
        return pollRepository.save(poll);
    }

    @Override
    public boolean delete(String id) {
        if (pollRepository.existsById(id)) {
            pollRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public FestivePoll getById(String id) {
        Optional<FestivePoll> optional = pollRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public List<FestivePoll> getBySocietyId(String societyId) {
        return pollRepository.findBySocietyId(societyId);
    }

    @Override
    public List<FestivePoll> getByOccasionId(String occasionId) {
        return pollRepository.findByOccasionId(occasionId);
    }
}