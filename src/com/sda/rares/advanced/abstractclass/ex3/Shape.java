package com.sda.rares.advanced.abstractclass.ex3;

public abstract class Shape {

    private int numSide;

    public Shape(int numSide) {
        this.numSide = numSide;
    }

    public int getNumSide() {
        return numSide;
    }

    public abstract void getArea();

    public abstract void getPerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "numSide=" + numSide +
                '}';
    }
}

