package com.conferences.fast.controller;

import com.conferences.fast.model.Event;
import com.conferences.fast.model.Location;
import com.conferences.fast.service.EventService;
import com.conferences.fast.service.LocationService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/locations")
public class LocationController extends BaseRestController<Location, Long>{

    private final LocationService service;

    public LocationController(LocationService service) {
        super(service);
        this.service = service;
    }
}
