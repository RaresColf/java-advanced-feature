package com.sda.rares.advanced.encapsulation.ex2;

/**
 * Ex 2 Create class Car. - Homework
 * a) Add private fields to the class, identificationNumber, carPlate, model, brand, engineDescription.
 * b) Create constructor that accepts all of the class fields.
 * c) Create additional constructor, that will accept only identificationNumber and carPlate. It should call main constructor with default values.
 * d) Create getters and setters for model, brand, engineDescription.
 * e) Create object of class Car. Verify if everything works as expected.
 * f) Add verification for all arguments passed to the setters.
 */
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("1875AAA8899","AR18RGT",
                "golf","VW","1.9TDI");
        System.out.println(car1);

        Car car2 = new Car("878547BBB548","AR20TTT");
        System.out.println(car2);

    }

}
