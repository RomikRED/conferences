package com.conferences.fast.model;

import lombok.Data;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data

@Entity
@Table(name = "agenda")
public class Agenda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private Duration duration;

    @ManyToMany
    private List<Participant> participants = new ArrayList<>();

    private String topic;

    @ManyToOne
    private Hall hall;

}
