package com.conferences.fast.service;

import com.conferences.fast.model.Agenda;
import com.conferences.fast.repository.AgendaRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgendaServiceImpl implements AgendaService {

    private final AgendaRepository repository;

    public AgendaServiceImpl(AgendaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Agenda> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Agenda save(Agenda entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
