package com.example.demo.model;

public class Vehicle {
    
    private String name;
    private int year;

    // Constructors, getters, and setters
    public Vehicle(String name, int year) {
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
