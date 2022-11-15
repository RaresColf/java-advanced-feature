package com.sda.rares.advanced.abstractclass.ex1;

/**
 * Abstract class exercise 1
 *
 * Create the abstract class Animal that will encapsulate the fallowing data:
 * - one abstract method walk()
 *
 * Next, create the fallowing concrete classes that will inherit from class Animal:
 * - Spider
 *   - the walk method should print "Sprider is walking with X legs", where X is the number of legs
 * - Cat
 *   - the walk method should print "Cat is walking with X legs", where X is the number of legs
 * - Fish
 *   - the walk method should print "Fish is walking with X legs", where X is the number of legs
 */
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Fish();

        for(Animal curretnAnimal: animals){
            curretnAnimal.breath();
            curretnAnimal.walk();
            curretnAnimal.feed("Crutons");

            System.out.println();
        }
    }
}
