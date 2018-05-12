package com.conferences.fast.service;

import java.io.Serializable;
import java.util.Optional;

public interface BaseService<E, ID> {

    Optional<E> getById(ID id);

    E save(E entity);

    void delete(ID id);
}
