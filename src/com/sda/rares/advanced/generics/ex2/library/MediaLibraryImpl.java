package com.sda.rares.advanced.generics.ex2.library;

import com.sda.rares.advanced.generics.ex2.model.Media;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class MediaLibraryImpl<M extends Media> implements MediaLibrary<M>{

    private M[] items;

    public MediaLibraryImpl(M[] items) {
        this.items = items;
    }

    @Override
    public M buy(String id) {
        for(M item : items){
            if(item.getId().equals(id)){
                return item;
            }
        } return null;
    }

    @Override
    public M searchByAuthor(String author) {
        for(M item : items){
            if(item.getAuthor().equals(author)){
                return item;
            }
        } return null;
    }

    @Override
    public M searchByPrice(double price) {
        for(M item : items){
            if(item.getPrice() == price) {
                return item;
            }
        } return null;
    }

    @Override
    public M searchByReleaseDate(Date releaseDate) {
//        LocalDate input = LocalDate.ofInstant(releaseDate.toInstant(), ZoneId.systemDefault());
//
//        for(M item : items){
//            if(LocalDate.ofInstant(item.getReleaseDate().toInstant(), ZoneId.systemDefault()).equals(input)){
//                return item;
//            }
//        }
        return null;
    }
}
