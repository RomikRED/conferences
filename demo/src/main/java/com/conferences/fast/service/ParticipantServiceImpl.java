package com.conferences.fast.service;

import com.conferences.fast.model.Participant;
import com.conferences.fast.repository.ParticipantRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class ParticipantServiceImpl implements ParticipantService {

    private final ParticipantRepository repository;

    public ParticipantServiceImpl(ParticipantRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Participant> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Participant save(Participant entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
