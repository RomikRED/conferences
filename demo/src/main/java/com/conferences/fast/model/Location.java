package com.conferences.fast.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(of = {"city", "address", "businessName", "capacity"})

@Entity
@Table(name = "location")
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String city;

    private String address;

    @Column(name = "business_name")
    private String businessName;

    private String description;

    private int capacity;

    @OneToMany(mappedBy = "location")
    private List<Hall> halls = new ArrayList<>();


}
