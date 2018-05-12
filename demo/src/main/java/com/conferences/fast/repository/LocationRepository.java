package com.conferences.fast.repository;

import com.conferences.fast.model.Location;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LocationRepository extends PagingAndSortingRepository<Location, Long>{
}
