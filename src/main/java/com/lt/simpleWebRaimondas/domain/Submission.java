package com.lt.simpleWebRaimondas.domain;

import javax.persistence.*;

@Entity
@Table(name = "submission")

public class Submission {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "ID")
        private Integer id;
        @Column(name = "FIRST_NAME")
        private String firstName;
        @Column(name = "LAST_NAME")
        private String lastName;


    public Integer getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Submission() {
    }


    public Submission(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}

