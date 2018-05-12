package com.conferences.fast.repository;

import com.conferences.fast.model.Participant;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ParticipantRepository extends PagingAndSortingRepository<Participant, Long> {
}
