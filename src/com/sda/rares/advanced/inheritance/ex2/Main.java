package com.sda.rares.advanced.inheritance.ex2;

import javax.swing.plaf.IconUIResource;

/**
 * ##### Inheritance Exercise 2 - Homework
 * Create classes Dog and Cat.
 * - Move common methods and fields to the class Animal.
 * - Create method „yieldVoice".
 * - Create simple array of type Animal, that will contain one object of type Dog and one object of type Cat.
 * - Using for-each loop show which animal gives what kind of voice. How to print a name of an object?
 */
public class Main {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Rex", "brown", 2,"German shepard");
        animals[1] = new Cat("Tom", "black", 4,"Persan");

        for(Animal curentAnimal: animals) {
            System.out.println(curentAnimal);
            curentAnimal.yieldVoice();

            // de ce nu imi printeaza si numele si culoarea animalului ?

        }

    }

}

