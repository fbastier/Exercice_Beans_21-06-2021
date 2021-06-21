package com.example.springapp.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;


public class AnotherCustomer implements Serializable {
    private String action;
    private int type;
    private Person person;

    public AnotherCustomer() {
    }

    @Autowired
    public AnotherCustomer(String action, int type, Person person) {
        this.action = action;
        this.type = type;
        this.person = person;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "AnotherCustomer{" +
                "action='" + action + '\'' +
                ", type=" + type +
                ", person=" + person +
                '}';
    }
}
