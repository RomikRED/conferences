package com.conferences.fast.controller;

import com.conferences.fast.model.Location;
import com.conferences.fast.service.AgendaService;
import com.conferences.fast.service.ParticipantService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/participants")
public class ParticipantController extends BaseRestController<Location, Long>{

    private final ParticipantService service;

    public ParticipantController(ParticipantService service) {
        super(service);
        this.service = service;
    }
}
