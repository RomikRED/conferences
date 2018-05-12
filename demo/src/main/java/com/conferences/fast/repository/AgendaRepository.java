package com.conferences.fast.repository;

import com.conferences.fast.model.Agenda;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends PagingAndSortingRepository<Agenda, Long> {
}
