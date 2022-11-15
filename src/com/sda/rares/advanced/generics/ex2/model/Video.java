package com.sda.rares.advanced.generics.ex2.model;


import java.util.Date;

public class Video extends Media {

    private String id;

    public Video(String author, Date releaseDate, double price, String id) {
        super(author, releaseDate, price);
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
