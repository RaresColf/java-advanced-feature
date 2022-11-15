package com.sda.rares.advanced.collections.set.ex1;

import java.util.HashSet;
import java.util.Set;

/**
 * ##### Collections SET Exercise 1
 * Create a set consisting of colors - given from the user.
 */
public class Main {
    public static void main(String[] args) {
        Set<String> colours = new HashSet<>();
        colours.add("red");
        colours.add("blue");
        colours.add("yellow");
        colours.add("purple");
        colours.add("pink");
        colours.add("red");
        colours.add("yellow");
        colours.add("pink");
        colours.add("pink");
        colours.add("green");
        colours.add("orange");

        for(String c : colours){
            System.out.println("-" + c);
        }

        colours.remove("green");

        for(String c : colours){
            System.out.println("-" + c);
        }



    }
}
