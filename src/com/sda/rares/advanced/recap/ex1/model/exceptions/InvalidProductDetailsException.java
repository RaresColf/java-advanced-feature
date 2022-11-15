package com.sda.rares.advanced.recap.ex1.model.exceptions;

public class InvalidProductDetailsException extends RuntimeException{

    public InvalidProductDetailsException(String message) {
        super(message);
    }
}
