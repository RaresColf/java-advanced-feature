package com.sda.rares.advanced.abstractclass.ex3;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle( double width, double height) {
        super(4);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Area is " + (width * height));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter is " + 2*(width + height));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
