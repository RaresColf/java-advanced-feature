package com.sda.rares.advanced.collections.map.ex2;

import javax.naming.event.ObjectChangeListener;
import java.util.*;

/**
 * ##### Collections MAP Exercise 2
 * Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string).
 * Read the string from the command line.
 * Ex: {d=[9], o=[4, 6], r=[7], W=[5], H=[0], l=[2, 3, 8], e=[1]}
 */
public class MainSolutionTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a string");

        String input = scanner.nextLine();

        Map<Character, List<Integer>> occurrencesByInteger = new HashMap<>();
        for (int i = 0; i < input.toCharArray().length; i++) {
            char currentChar = input.toCharArray()[i];

            occurrencesByInteger.putIfAbsent(currentChar, new ArrayList<>());     // am folosit metoda putIfAbsent si am simplificat verificarea aia din Main
            occurrencesByInteger.get(currentChar).add(i);

        }
            for (Map.Entry<Character, List<Integer>> entry : occurrencesByInteger.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());

            }

        }
    }
