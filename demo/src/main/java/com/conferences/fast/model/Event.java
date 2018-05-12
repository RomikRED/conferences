package com.conferences.fast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = {"name", "location", "duration"})
@ToString(exclude = {"participants"})

@JsonIgnoreProperties({"participants"})

@Entity
@Table(name = "event")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "conduction_date")
    private LocalDateTime date;

    private String name;

    private boolean isActive;

    @ManyToOne
    private Location location;

    private Duration duration;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Participant> participants = new ArrayList<>();

    @OneToMany
    private List<Agenda> agenda = new ArrayList<>();

}
