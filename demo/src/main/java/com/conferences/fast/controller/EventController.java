package com.conferences.fast.controller;

import com.conferences.fast.model.Event;
import com.conferences.fast.service.EventService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/events")
public class EventController extends BaseRestController<Event, Long>{

    private final EventService service;

    public EventController(EventService service) {
        super(service);
        this.service = service;
    }

    @GetMapping("/active")
    public ResponseEntity getActive(){
        Page<Event> activeEvents = service.getActiveEvents(PageRequest.of(0, 5));
        return ResponseEntity.ok(activeEvents);
    }

}
