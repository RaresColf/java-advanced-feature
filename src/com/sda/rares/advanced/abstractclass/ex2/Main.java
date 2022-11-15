package com.sda.rares.advanced.abstractclass.ex2;

import java.util.Random;

/**
 * Create classes Dog and Cat.
 * - Move common methods and fields to the class Animal.
 * - Create abstract method „yieldVoice".
 * - Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * - Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 */

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Animal[] animals = new Animal[4];
        animals[0] = new Dog(random.nextDouble(),"Jack");
        animals[1] = new Cat(random.nextDouble(),"Tom");
        animals[2] = new Dog(random.nextDouble(),"Spike");
        animals[3] = new Cat(random.nextDouble(),"Jerry");

        Animal animalWithMinWeight = animals[0];
        Animal animalWithMaxWeight = animals[0];

        for(Animal animal : animals){
            if(animal.getWeight()>animalWithMaxWeight.getWeight()){
                animalWithMaxWeight = animal;

            }
            if(animal.getWeight()<animalWithMinWeight.getWeight()) {
                animalWithMinWeight = animal;
            }
        }
        System.out.println(animalWithMaxWeight);
        animalWithMaxWeight.yieldVoice();

        System.out.println(animalWithMinWeight);
        animalWithMinWeight.smell();

    }


}
