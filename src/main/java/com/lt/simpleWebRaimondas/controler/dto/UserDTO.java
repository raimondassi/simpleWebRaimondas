package com.lt.simpleWebRaimondas.controler.dto;

import java.util.List;

public class UserDTO {
    private String name;
    private String lastname;
    private String gender;
    List<String> possibleGenders;


    public List<String> getPossibleGenders() {
        return possibleGenders;
    }


    public void setPossibleGenders(List<String> possibleGenders) {
        this.possibleGenders = possibleGenders;
    }


    public UserDTO() {
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getName() {
        return name;
    }


    public String getLastname() {
        return lastname;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
