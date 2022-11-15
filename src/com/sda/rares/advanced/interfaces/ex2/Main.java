package com.sda.rares.advanced.interfaces.ex2;

/**
 * ##### Interfaces Exercise 1
 *
 * Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards.
 *        Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods.
 */
public class Main {
    public static void main(String[] args) {
        CharSequence charSequence = new ReversedCharSequence("java");
        CharSequence charSequence2 = new ReversedCharSequence("python");

        System.out.println(String.join("/", charSequence,charSequence2));
    }
}
