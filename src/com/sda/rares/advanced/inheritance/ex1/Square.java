package com.sda.rares.advanced.inheritance.ex1;

public class Square extends Rectangle {

    private double lenght;

    public Square( double lenght) {
        super(lenght, lenght);
        this.lenght = lenght;
    }

    public double getLenght() {
        return lenght;
    }

    @Override
    public String toString() {
        return "Square{" +
                "lenght=" + lenght +
                '}' + super.toString();
    }
}
