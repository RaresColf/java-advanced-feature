package com.sda.rares.advanced.abstractclass.ex2;

public class Cat extends Animal{

    public Cat(double weight, String name) {
        super(weight, name);
    }

    @Override
    public void smell() {
        System.out.println("The cat smells");
    }

    @Override
    public void yieldVoice() {
        System.out.println(" Meow");
    }
}
