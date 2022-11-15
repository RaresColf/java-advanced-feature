package com.sda.rares.advanced.concurancy.ex1;

import java.time.LocalTime;

public class Employee extends Thread {
    private static long workingInterval = 10000;

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("<" + name + " I came to work at <time " + LocalTime.now() + ">");
        while (true) {      // atata timp cat lucreaza trebuie sa imi printeze ca lucreaza
            try {
                Thread.sleep(workingInterval);
                System.out.println(name + ": I am still working " + LocalTime.now());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void goHome(){
        System.out.println(name + "Is time to go home! ");
        workingInterval -= 2000;   // am scazut intevalul de lucru cu 2 secunde
        stop();
    }
}
