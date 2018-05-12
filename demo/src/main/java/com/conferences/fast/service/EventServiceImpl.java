package com.conferences.fast.service;

import com.conferences.fast.model.Event;
import com.conferences.fast.repository.EventRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Optional;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository repository;

    public EventServiceImpl(EventRepository repository) {
        this.repository = repository;
    }

    @Override
    public Page<Event> getActiveEvents(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Event save(@Valid Event event) {
        return repository.save(event);
    }

    @Override
    public Optional<Event> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
