package com.sda.rares.advanced.abstractclass.ex3;

/**
 * ##### Abstract class exercise 1 - Homework
 *
 * a. Write an abstract class Shape
 * – Data members: numSides
 * – Constructor: initialize numSides
 * – Concrete method: get method for numSides
 * – Abstract methods: getArea(), getPerimeter()
 * b. Write a concrete subclass Rectangle
 * – Data members: width, height
 * c. Write a concrete subclass Triangle
 * – Data members: width, height
 *
 * In another class, write a main method to define a Rectangle and a Triangle.
 */
public class Main {
    public static void main(String[] args) {


        Shape shape1 = new Rectangle( 5, 10);
        Shape shape2 = new Triangle(10, 4);


        System.out.println(shape1);
        shape1.getArea();
        shape1.getPerimeter();

        System.out.println(shape2);
        shape2.getArea();
        shape2.getPerimeter();

    }
}