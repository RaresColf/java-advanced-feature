package com.sda.rares.advanced.interfaces.ex1;

import java.time.LocalDate;
import java.time.LocalTime;

public interface DateAndTimeSubscriber {

    void publishDateAndTime(LocalDate date, LocalTime time);

}
