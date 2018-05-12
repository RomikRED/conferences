package com.conferences.fast.service;

import com.conferences.fast.model.Location;
import com.conferences.fast.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository repository;

    public LocationServiceImpl(LocationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Location> getById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Location save(Location entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
