package com.sda.rares.advanced.interfaces.ex3;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Car vehicle1 = new Car();
        SpeedDisplay speedDisplay = new SpeedDisplay(vehicle1);

        speedDisplay.start();
        vehicle1.start();
        speedDisplay.start();
    }
}
