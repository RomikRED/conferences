package com.conferences.fast.service;

import com.conferences.fast.model.Hall;
import com.conferences.fast.repository.HallRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class HallServiceImpl implements HallService {

    private final HallRepository repository;

    public HallServiceImpl(HallRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Hall> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Hall save(Hall entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
