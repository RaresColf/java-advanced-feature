package com.sda.rares.advanced.inheritance.ex2;

public class Cat extends Animal{

    private String breed;

    public Cat(String name, String colour, int age, String breed) {
        super(name, colour, age);
        this.breed = breed;
    }

    @Override
    public void yieldVoice() {
        System.out.println(" meow meow");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return super.toString() + "Cat{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
