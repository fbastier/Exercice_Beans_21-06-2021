package com.example.springapp.model;

public class Developper {
    private String name;
    private int nbYear;

//    public Developper(String name, int nbYear) {
//        this.name = name;
//        this.nbYear = nbYear;
//    }

    public Developper() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbYear() {
        return nbYear;
    }

    public void setNbYear(int nbYear) {
        this.nbYear = nbYear;
    }

    @Override
    public String toString() {
        return "Developper{" +
                "name='" + name + '\'' +
                ", nbYear=" + nbYear +
                '}';
    }
}

