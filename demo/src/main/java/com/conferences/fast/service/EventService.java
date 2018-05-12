package com.conferences.fast.service;


import com.conferences.fast.model.Event;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.Optional;

public interface EventService extends BaseService<Event, Long>{
    Page<Event> getActiveEvents(Pageable pageable);

    Event save(@Valid Event event);

    Optional<Event> getById(Long id);

    void delete(Long id);
}
