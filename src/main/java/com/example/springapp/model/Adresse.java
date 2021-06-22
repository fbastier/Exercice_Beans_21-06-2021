package com.example.springapp.model;

import java.io.Serializable;

public class Adresse implements Serializable {
    private String fullAdress;

    public Adresse() {
    }

    public String getFullAdress() {
        return fullAdress;
    }

    public void setFullAdress(String fullAdress) {
        this.fullAdress = fullAdress;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "fullAdress='" + fullAdress + '\'' +
                '}';
    }
}
