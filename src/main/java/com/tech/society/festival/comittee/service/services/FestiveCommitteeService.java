package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.FestiveCommittee;

import java.util.List;

public interface FestiveCommitteeService {
    FestiveCommittee create(FestiveCommittee committee);

    FestiveCommittee update(FestiveCommittee committee);

    boolean delete(String id);

    FestiveCommittee getById(String id);

    List<FestiveCommittee> getBySocietyId(String societyId);
}
