package com.sda.rares.advanced.interfaces.ex3;

public class SpeedDisplay {

    private Vehicle vehicle;

    public SpeedDisplay(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() throws InterruptedException {
        for(int i=1; i<5; i++){
            System.out.println(vehicle.getSpeed() + vehicle.getUnit());
            Thread.sleep((1000));
        }
    }
}
