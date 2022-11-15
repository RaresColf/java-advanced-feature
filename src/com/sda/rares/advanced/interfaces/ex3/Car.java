package com.sda.rares.advanced.interfaces.ex3;

public class Car implements Vehicle{

 private int currentSpeed;

 public void start() throws InterruptedException {
     for(int i=0; i<5; i++){
         currentSpeed ++;
         Thread.sleep(1000);
     }
 }

    @Override
    public int getSpeed() {
        return currentSpeed;
    }

    @Override
    public String getUnit() {
        return KMH;
    }
}
