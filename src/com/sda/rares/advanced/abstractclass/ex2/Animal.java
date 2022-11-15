package com.sda.rares.advanced.abstractclass.ex2;

public abstract class Animal {

    private double weight;
    private String name;

    public Animal(double weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public abstract void smell();
    public abstract void yieldVoice();


    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", name=" + name +
                '}';
    }
}
