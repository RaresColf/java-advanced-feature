package com.sda.rares.advanced.inheritance.ex1;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle( double width, double lenght) {
        super((lenght * width), (2*(width * lenght)));
        this.width = width;
        this.length = lenght;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                '}'+ super.toString();
    }
}
