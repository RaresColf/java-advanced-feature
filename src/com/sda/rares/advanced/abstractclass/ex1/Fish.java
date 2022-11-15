package com.sda.rares.advanced.abstractclass.ex1;

public class Fish extends AquaticAnimal {
    @Override
    public void walk() {
        System.out.println(" Fish can swim ");
    }

    @Override
    public void feed(String food) {
        System.out.println(" Fish is feeding with " + food);
    }
}
