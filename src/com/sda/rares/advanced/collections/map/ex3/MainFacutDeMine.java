package com.sda.rares.advanced.collections.map.ex3;

import java.util.*;

/**
 * ##### Collections MAP Exercise 3
 * Write a program which count the number of each character occurring in a string.
 * Read the string from the command line.
 * Ex: {d=9, o=6, r=7, W=5}
 */
public class MainFacutDeMine {
    public static void main(String[] args) {

        System.out.println("Plese enter a phrase");
        Scanner scanner = new Scanner(System.in);
        String phrase = scanner.nextLine();

        HashMap<Character, List<Integer>> characterListMap = new HashMap<>();
        for (int i = 0; i < phrase.toCharArray().length; i++){
            char currentCharacter = phrase.toCharArray()[i];
            int countingElement = 1;
            if(characterListMap.containsKey(currentCharacter)){
                List<Integer> currentNumber = new ArrayList<>(currentCharacter);
                countingElement = countingElement + 1;
                currentNumber.add(countingElement);
                characterListMap.put(currentCharacter, currentNumber);
            }else {
                List<Integer> value = new ArrayList<>();
                value.add(countingElement);
                characterListMap.put(currentCharacter, value);
            }
        }

        for (Map.Entry<Character, List<Integer>> entry : characterListMap.entrySet()){
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

    }
}
