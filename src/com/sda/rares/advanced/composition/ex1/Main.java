package com.sda.rares.advanced.composition.ex1;

/**
 Write a Java class Author with following features:
 - Instance variables :
 - firstName for the author's first name of type String.
 - lastName for the author's last name of type String.
 - Constructor:
 - A constructor with parameters, it creates the Author object by setting the two fields to the passed values.
 - Instance methods:
 - Getters and setters for variables
 - toString(): This method printed out author's name to the screen

 Write a Java class Book with following features:
 - Instance variables :
 - title for the title of book of type String.
 - author for the author's name of type Author.
 - price for the book price of type double.
 - Constructor:
 - A constructor with parameters, it creates the Author object by setting the the fields to the passed values.
 - Instance methods:
 - Getters and setters for variables
 - toString(): This method printed out book's details to the screen
 */

public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Ion","Creanga");
        Book book1 = new Book("Title1", author1, 200);
        Book book2 = new Book("Title2", author1,150);
        System.out.println(book1);
        System.out.println(book2);

    }
}
