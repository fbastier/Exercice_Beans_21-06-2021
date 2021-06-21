package com.example.springapp.Model;

import java.io.Serializable;

public class KungFu implements Serializable {
    private String name;

    public KungFu() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
