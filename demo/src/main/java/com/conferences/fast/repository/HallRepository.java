package com.conferences.fast.repository;

import com.conferences.fast.model.Hall;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HallRepository extends PagingAndSortingRepository<Hall, Long> {
}
