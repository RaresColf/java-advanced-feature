package com.sda.rares.advanced.abstractclass.ex1;

public class Cat extends LandAnimal {

    @Override
    public void walk() {
        System.out.println("Cat is waking ");
    }

    @Override
    public void feed(String food) {
        System.out.println(" Cat is feeding with " + food);
    }

    @Override
    public void breath() {
        System.out.println(" Cat is breathing air ");
    }
}
