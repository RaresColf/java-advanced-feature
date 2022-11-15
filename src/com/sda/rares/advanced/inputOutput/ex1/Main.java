package com.sda.rares.advanced.inputOutput.ex1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * ##### IO Exercise 1
 * Write a Java program to find the longest word in a text file.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("D:\\SDA Projects\\JavaAdvancedFeature\\src\\com\\sda\\rares\\advanced\\inputOutput\\ex1\\File.txt");

        List<String> fileLines = Files.readAllLines(path);
        String longestWord = "";
        for(String line : fileLines){
            for (String currentWord: line.split(" ")){       // am spart fisierul in linii si acuma sparg liniile in cuvinte
                if(currentWord.length() > longestWord.length()){   // verificam daca cuvantul curent este mai mare decat cel mai mare cuvant
                    longestWord = currentWord;
                }
            }
        }
        System.out.println("The longhest word is: " + longestWord);
    }
}
