package com.conferences.fast.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "participant")
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "participate_as", columnDefinition = "")
    private Role role;

    @Column(name = "first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    private String authorities;

    private String description;
}
