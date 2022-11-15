package com.sda.rares.advanced.interfaces.ex1;

/**
 * ##### Interfaces Exercise 2
 *
 * Suppose you have written a time server that periodically notifies its clients of the current date and time.
 * Write an interface the server could use to enforce a particular protocol on its clients.
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DateAndTimeSubscriber[] subscribers = new DateAndTimeSubscriber[4];
        subscribers[0] = new ClientSout();
        subscribers[1] = new ClientSerr();
        subscribers[2] = new ClientSout();
        subscribers[3] = new ClientSerr();

        TimeServer timeServer = new TimeServer(subscribers);

        for (int i = 0; i < 20; i++) {
            timeServer.notifySubscribers();
            Thread.sleep(1000);

        }
    }
}