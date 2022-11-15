package com.sda.rares.advanced.generics.ex2.model;

import java.util.Date;

public abstract class Media {

    private String author;
    private Date releaseDate;
    private double price;

    public Media(String author, Date releaseDate, double price) {
        this.author = author;
        this.releaseDate = releaseDate;
        this.price = price;
    }

    public abstract String getId();


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Media{" +
                "author='" + author + '\'' +
                ", releaseDate=" + releaseDate +
                ", price=" + price +
                '}';
    }
}
