package com.sda.rares.advanced.generics.ex1;

import java.awt.event.PaintEvent;

/**
 * ##### Generics Exercise 1
 *
 * Create a Person class that will implement a Comparable interface.
 * Person class should implement compareTo method, that will verify if one person is taller than another.
 */
public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Andrei", 1.87);
        Person person2 = new Person("Ion", 1.8);

        System.out.println(person2.compareTo(person2));
    }
}
