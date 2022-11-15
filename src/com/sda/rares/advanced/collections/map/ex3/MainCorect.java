package com.sda.rares.advanced.collections.map.ex3;



import java.util.HashMap;
import java.util.Scanner;

    /**
     * ##### Collections MAP Exercise 3
     * Write a program which count the number of each character occurring in a string.
     * Read the string from the command line.
     * Ex: {d=9, o=6, r=7, W=5}
     */

    public class MainCorect {
        public static void main(String args[]) {

            //Citire String la consolă
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert a string to count the number of each character occurrences! ");
            String myStringForEx3 = scanner.nextLine();

            //Creare HashMap cu caracter drept key și instanță (occurrence) ca valoare
            HashMap<Character, Integer> countingOccurrences = new HashMap<>();

            //iterare prin String cu folosire de metodă charAt de i care returnează fiecare caracter la indexul lui
            for (int i = 0; i < myStringForEx3.length(); i++) {
                Character newCharacter = myStringForEx3.charAt(i);

                //Actualizare valoare contor în HashMap și, pentru fiecare caracter nou, se verifica dacă este deja în HashMap.
                //Dacă HashMap nu conține caracterul, count la 1 și se pune în HashMap cu caracter drept cheie și instanță la valoare
                if (countingOccurrences.containsKey(newCharacter)) {
                    int count = countingOccurrences.get(newCharacter);
                    countingOccurrences.put(newCharacter, count + 1);

                    //Dacă HashMap conține caracterul, se incrementează counter-ul cu 1
                } else {
                    countingOccurrences.put(newCharacter, 1);
                }
            }
            System.out.println(countingOccurrences);
            System.out.println("Ain't this awesome?! LOL! :)");
        }
    }

