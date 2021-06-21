package com.example.springapp.Model;

public class House {

    private String address;
    private int nbWindow;
    private int nbDoor;
    private String owner;

public House(String address, int nbWindow, int nbDoor, String owner) {
        this.address = address;
        this.nbWindow = nbWindow;
        this.nbDoor = nbDoor;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "address='" + address + '\'' +
                ", nbWindow=" + nbWindow +
                ", nbDoor=" + nbDoor +
                ", owner='" + owner + '\'' +
                '}';
    }
}