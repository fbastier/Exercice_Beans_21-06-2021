package com.example.springapp.Model;

import java.io.Serializable;

public class Customer implements Serializable {
    private String nom;
    private Adresse monAdresse;

    public Customer() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getMonAdresse() {
        return monAdresse;
    }

    public void setMonAdresse(Adresse monAdresse) {
        this.monAdresse = monAdresse;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "nom='" + nom + '\'' +
                ", monAdresse=" + monAdresse +
                '}';
    }
}
