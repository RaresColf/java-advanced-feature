package com.sda.rares.advanced.abstractclass.ex2;

public class Dog extends Animal{

    public Dog(double weight, String name) {
        super(weight, name);
    }

    @Override
    public void smell() {
        System.out.println("The dog smells");
    }

    @Override
    public void yieldVoice() {
        System.out.println(" Bark");
    }
}
