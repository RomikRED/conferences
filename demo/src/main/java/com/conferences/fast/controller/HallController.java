package com.conferences.fast.controller;

import com.conferences.fast.model.Location;
import com.conferences.fast.service.HallService;
import com.conferences.fast.service.ParticipantService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/halls")
public class HallController extends BaseRestController<Location, Long>{

    private final HallService service;

    public HallController(HallService service) {
        super(service);
        this.service = service;
    }
}
