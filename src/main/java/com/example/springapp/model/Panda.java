package com.example.springapp.model;

import java.io.Serializable;

public class Panda implements Serializable {
    private KungFu kungFu;

    public Panda(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    public KungFu getKungFu() {
        return kungFu;
    }

    public void setKungFu(KungFu kungFu) {
        this.kungFu = kungFu;
    }

    @Override
    public String toString() {
        return "Panda{" +
                "kungFu=" + kungFu +
                '}';
    }
}
