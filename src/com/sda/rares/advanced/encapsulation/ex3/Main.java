package com.sda.rares.advanced.encapsulation.ex3;

/**
 * Ex 3 Create class Student. - Homework
 *    a) Add private fields to the class: firstName,lastName, classRoom, averageGrade.
 *    b) Create constructor that accepts all of the class fields.
 *    c) Create additional constructor, that will accept only firstName,lastName and classRoom. It should call main constructor with default values.
 *    d) Create getters and setters for  firstName,lastName, class, averageGrade..
 *    e) Create object of class Student. Verify if everything works as expected.
 *    f) Add verification for all arguments passed to the setters
 *
 *    // in cazul stringurilor e bine sa le verificam prima data daca sunt e nulle si apoi cu metoda .isBlank - asa reusim sa ne protejam din ambele cazuri metoda noastra
 */
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Rares", "Colf", "12A", 5.55);
        Student student2 = new Student("Rares", "Colf", "12A");
        Student student3 = new Student("Rares", null, "12A", 8.80);
        Student student4 = new Student("Rares", "Colf", "12A", 0);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
    }
}
