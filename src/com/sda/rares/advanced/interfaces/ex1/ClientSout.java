package com.sda.rares.advanced.interfaces.ex1;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClientSout implements DateAndTimeSubscriber{


    @Override
    public void publishDateAndTime(LocalDate date, LocalTime time) {
        System.out.println(date + " " + time);
    }
}
