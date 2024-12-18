package org.example;

public class Patron {
    private String name;
    private int patronId;

    // Constructor to initialize Patron object
    public Patron(String name, int patronId) {
        this.name = name;
        this.patronId = patronId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatronId() {
        return patronId;
    }

    public void setPatronId(int patronId) {
        this.patronId = patronId;
    }

    // Display Patron details
    @Override
    public String toString() {
        return "Patron{" +
                "Name='" + name + '\'' +
                ", Patron ID=" + patronId +
                '}';
    }
}

