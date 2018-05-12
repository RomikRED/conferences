package com.conferences.fast.model;

import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String name;

    private String description;

    private int capacity;

    @Embedded
    private Sides sides;

    @ManyToOne
    private Location location;

}
