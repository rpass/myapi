package com.example.model;

public class Contact {
    private final String name;
    private final String number;

    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return this.name + " has contact number " + this.number;
    }
}
