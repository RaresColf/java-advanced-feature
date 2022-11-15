package com.sda.rares.advanced.interfaces.ex2;

import java.util.stream.IntStream;

public class ReversedCharSequence implements CharSequence{

    private String reversedString;

    public ReversedCharSequence(String string) {
        this.reversedString = reverseString(string);
    }

    private String reverseString(String string) {
        String reversedString = "";
        for (Character currentCharacter : string.toCharArray()) {
            reversedString = currentCharacter + reversedString;
        }
        return reversedString;
    }

    @Override
    public int length() {
        return reversedString.length();
    }

    @Override
    public char charAt(int index) {
        return reversedString.charAt(index);
    }
//
//    @Override
//    public boolean isEmpty() {
//        return reversedString.isEmpty();
//    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return reversedString.subSequence(start,end);
    }

    @Override
    public IntStream chars() {
        return reversedString.chars();
    }

    @Override
    public IntStream codePoints() {
        return reversedString.codePoints();
    }

    @Override
    public String toString() {
        return reversedString ;
    }
}
