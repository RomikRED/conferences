package com.conferences.fast.controller;

import com.conferences.fast.service.BaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.Optional;

public class BaseRestController<E, ID extends Serializable> {

    private BaseService service;

    public BaseRestController(BaseService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public ResponseEntity<E> getActive(@PathVariable("id") ID id){
        Optional<E> entity = service.getById(id);
        return entity
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<E> save(@RequestBody E entity){
        E saved = (E) service.save(entity);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<E> update(@RequestBody E entity){
        return ResponseEntity.ok((E) service.save(entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable("id") ID id){
        service.delete(id);
        return ResponseEntity.ok().build();
    }
}
