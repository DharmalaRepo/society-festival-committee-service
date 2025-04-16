
package com.tech.society.festival.comittee.service.services;

import com.tech.society.festival.comittee.service.models.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FestiveVolunteerService {
    FestiveVolunteer create(FestiveVolunteer volunteer);
    List<FestiveVolunteer> getByOccasionId(String occasionId);
    List<FestiveVolunteer> getByResidentId(String residentId);
}
