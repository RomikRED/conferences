package com.conferences.fast.controller;

import com.conferences.fast.model.Location;
import com.conferences.fast.service.AgendaService;
import com.conferences.fast.service.LocationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/agendas")
public class AgendaController extends BaseRestController<Location, Long>{

    private final AgendaService service;

    public AgendaController(AgendaService service) {
        super(service);
        this.service = service;
    }
}
