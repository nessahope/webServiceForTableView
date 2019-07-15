package com.hope.webservicefortableview;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Superhero {

    @Id
    @GeneratedValue
    private long id;

    private String name;
    private String powers;
    private String birthPlace;

    public Superhero() {
    }

    public Superhero(long id, String name, String powers, String birthPlace) {
        this.id = id;
        this.name = name;
        this.powers = powers;
        this.birthPlace = birthPlace;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowers() {
        return powers;
    }

    public void setPowers(String powers) {
        this.powers = powers;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }




}