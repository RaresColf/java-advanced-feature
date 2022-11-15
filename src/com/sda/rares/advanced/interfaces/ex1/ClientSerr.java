package com.sda.rares.advanced.interfaces.ex1;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClientSerr implements DateAndTimeSubscriber{

    @Override

    public void publishDateAndTime(LocalDate date, LocalTime time) {
        System.err.println(date + " " + time);
    }
}
