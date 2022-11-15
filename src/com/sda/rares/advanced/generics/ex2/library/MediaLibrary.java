package com.sda.rares.advanced.generics.ex2.library;

import com.sda.rares.advanced.generics.ex2.model.Media;

import java.util.Date;

public interface MediaLibrary<M extends Media> {

    M buy(String id);
    M searchByAuthor(String author);
    M searchByPrice(double price);
    M searchByReleaseDate(Date releaseDate);

}
