package com.sda.rares.advanced.lambda.ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * ##### Lambda Exercise 2
 * Write a program that reads a collection of strings, separated by one or more whitespaces, from the console and then prints
 * them onto the console. Each string should be printed on a new line. Use a Consumer<T>.
 * - Input: Pesho Gosho Adasha
 * - Output:
 *   - Pesho
 *   - Gosho
 *   - Adasha
 */
public class Main {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Pesho Gosho Adasha", "Pesho Gosho Adasha");
        processStrings (
                strings,
                string -> System.err.println(string),
                () -> {
                    Scanner scanner = new Scanner(System.in);
                    return scanner.nextLine();
                }
        );
    }

    private static void processStrings(List<String> strings, Consumer<String> consumer, Supplier<String> supplier) {
        String prefix = supplier.get();
        for (String string : strings) {
            for (String word : string.split(" ")) {
                consumer.accept(prefix + word);
            }
        }
    }
}

