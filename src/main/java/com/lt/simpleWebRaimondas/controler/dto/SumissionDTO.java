package com.lt.simpleWebRaimondas.controler.dto;

public class SumissionDTO {

    Integer id;
    String firstName;
    String lastName;
    UserDTO userDTO;


    public UserDTO getUserDTO() {
        return userDTO;
    }


    public Integer getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }
}
