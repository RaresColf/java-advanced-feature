package com.sda.rares.advanced.abstractclass.ex4;

/**
 *
 * ##### Abstract class exercise 2 - Homework
 *
 * Create an abstract class 'Bank' with an abstract method 'getBalance'.
 *         $100, $150 and $200 are deposited in banks A, B and C respectively.
 *        'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank',
 *         each having a method named 'getBalance'.
 * Call this method by creating an object of each of the three classes.
 */
public class Main {
    public static void main(String[] args) {

        Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();


    }
}
