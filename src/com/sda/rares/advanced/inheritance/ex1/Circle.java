package com.sda.rares.advanced.inheritance.ex1;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        super((Math.PI * Math.pow(radius,2)), 2*Math.PI * radius);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}' + super.toString();
    }
}
