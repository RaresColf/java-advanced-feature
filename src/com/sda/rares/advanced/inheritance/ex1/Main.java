package com.sda.rares.advanced.inheritance.ex1;

/**
 * Create a Shape class.
 * - Add fields, create constructor, getters and setters.
 * - Create classes Rectangle and Circle. Both of them should inherit class Shape.
 * - Which fields and methods are common?
 */
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape(5, 7);
        shapes[1] = new Rectangle(10, 15);
        shapes[2] = new Circle(3);
        shapes[3] = new Square(20);
        Shape shapeWithMaxArea = shapes[0];

        for (Shape curentShape : shapes) {
            if (curentShape.getArea() > shapeWithMaxArea.getArea()) {
                shapeWithMaxArea = curentShape;
            }
        }
        System.out.println(shapeWithMaxArea.toString());
    }
}