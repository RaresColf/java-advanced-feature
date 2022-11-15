package com.sda.rares.advanced.abstractclass.ex3;

public class Triangle extends Shape{

    private double width;
    private double height;

    public Triangle(double width, double height) {
        super(3);
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.println("Area is " +((width*height)/2));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter is " +(3*width ));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
