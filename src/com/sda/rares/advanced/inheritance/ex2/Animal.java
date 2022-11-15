package com.sda.rares.advanced.inheritance.ex2;

public class Animal {
    private String name;
    private String colour;
    private int age;

    public Animal(String name, String colour, int age) {
        this.name = name;
        this.colour = colour;
        this.age = age;
    }

    public void yieldVoice(){
        System.out.println(" Unknown ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                '}';
    }
}
