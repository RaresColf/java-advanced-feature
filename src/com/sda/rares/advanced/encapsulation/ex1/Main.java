package com.sda.rares.advanced.encapsulation.ex1;

import org.w3c.dom.ls.LSOutput;

/**
 * ##### Encapsulation exercise 1
 *    - Create class Dog.
 *    - Add private fields to the class, like name, age, gender, race, weight.
 *    - Create constructor that accepts all of the class fields.
 *    - Create additional constructor, that will accept only gender and race. It should call main constructor with default values.
 *    - Create getters and setters for age and weight.
 *    - Create object of class Dog. Verify if everything works as expected.
 *    - Add verification for all arguments passed to the setters. E.g. setWeight method should not accept values below or equal to 0.
 *
 */
public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog ("Rex",2,"male","canis", 4);
        System.out.println(dog1);

        Dog dog2 = new Dog("female","Canis");
        System.out.println(dog2);

        dog1.setAge(-5);
        dog1.setWeight(250);
        System.out.println(dog1);
    }




}
