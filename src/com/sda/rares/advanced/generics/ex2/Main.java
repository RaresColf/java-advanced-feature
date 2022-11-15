package com.sda.rares.advanced.generics.ex2;


import com.sda.rares.advanced.generics.ex2.library.MediaLibrary;
import com.sda.rares.advanced.generics.ex2.library.MediaLibraryImpl;
import com.sda.rares.advanced.generics.ex2.model.Book;

import java.util.Date;

/**
 * ##### Generics Exercise 4
 * Design a class that acts as a library for the following kinds of media: book, video, and newspaper.
 * Provide one version of the class that uses generics.
 * Feel free to use any additional APIs for storing and retrieving the media.
 */
public class Main {
    public static void main(String[] args) {

        Book[] books = new Book[3];
        books[0] = new Book("J", new Date(), 20,"122445");
        books[1] = new Book("K", new Date(), 55,"198775");
        books[2] = new Book("L", new Date(), 33,"129975");

        MediaLibrary<Book> bookMediaLibrary = new MediaLibraryImpl<>(books);
        System.out.println(bookMediaLibrary.buy("122445"));
        System.out.println(bookMediaLibrary.searchByAuthor("K"));
        System.out.println(bookMediaLibrary.searchByPrice(33));
        System.out.println(bookMediaLibrary.searchByReleaseDate(new Date()));

    }
}
