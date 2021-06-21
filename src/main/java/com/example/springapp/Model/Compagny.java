package com.example.springapp.Model;

public class Compagny {
    private String compagnyName;
    private Developper dev1;
    private Developper dev2;

/*    public Compagny(String compagnyName, Developper dev1, Developper dev2) {
        this.compagnyName = compagnyName;
        this.dev1 = dev1;
        this.dev2 = dev2;
    }*/

    public Compagny() {
    }

    public String getCompagnyName() {
        return compagnyName;
    }

    public void setCompagnyName(String compagnyName) {
        this.compagnyName = compagnyName;
    }

    public Developper getDev1() {
        return dev1;
    }

    public void setDev1(Developper dev1) {
        this.dev1 = dev1;
    }

    public Developper getDev2() {
        return dev2;
    }

    public void setDev2(Developper dev2) {
        this.dev2 = dev2;
    }

    @Override
    public String toString() {
        return "Compagny{" +
                "compagnyName='" + compagnyName + '\'' +
                ", dev1=" + dev1 +
                ", dev2=" + dev2 +
                '}';
    }
}
