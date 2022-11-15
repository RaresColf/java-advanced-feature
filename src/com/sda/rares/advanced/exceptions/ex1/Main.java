package com.sda.rares.advanced.exceptions.ex1;

import java.util.Scanner;

/**
 * ##### Exceptions Exercise 1
 * <p>
 * Write an application that will read the input and print back value that user provided, use try-catch statements to parse the input, e.g.
 * <p>
 * - I/O:
 * Input: 10
 * Output: int -> 10
 * Input: 10.0
 * Output: double -> 10.0
 * Input: „Hello!"
 * Output: „Hey! That's not a value! Try once more."
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Please insert a value ");
        String inputString = scanner.nextLine();
        try {
            int inputInt = Integer.parseInt(inputString);
            System.out.println("int -> " + inputInt);

        } catch (NumberFormatException ex) {

            try {
                double inputDouble = Double.parseDouble(inputString);
                System.out.println(" double -> " + inputDouble);

            } catch (NumberFormatException ex1) {
                System.out.println("Hey! That's not a value! Try once more ");

            }
        }
        finally {
            scanner.close();
            System.out.println("End of execution ");
        }


    }
}
