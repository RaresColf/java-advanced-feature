package com.sda.rares.advanced.exceptions.ex2.model;

public class Car {

    private String id;
    private String name;
    private int yearOfProduction;

    public Car(String id, String name, int yearOfProduction) {
        this.id = id;
        this.name = name;
        this.yearOfProduction = yearOfProduction;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
