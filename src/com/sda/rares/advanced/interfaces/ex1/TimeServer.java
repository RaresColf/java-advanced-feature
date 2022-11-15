package com.sda.rares.advanced.interfaces.ex1;

import org.w3c.dom.html.HTMLImageElement;

import java.time.LocalDate;
import java.time.LocalTime;

public class TimeServer {
    // am plecat de la interfete si acuma ajung la encapsulation
    private DateAndTimeSubscriber[] subscribers ;

    public TimeServer(DateAndTimeSubscriber[] subscribers) {
        this.subscribers = subscribers;
    }

    public void notifySubscribers(){
        for(DateAndTimeSubscriber subscriber : subscribers){
            subscriber.publishDateAndTime(LocalDate.now(), LocalTime.now());
        }
    }

    public DateAndTimeSubscriber[] getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(DateAndTimeSubscriber[] subscribers) {
        this.subscribers = subscribers;
    }


}
