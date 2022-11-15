package com.sda.rares.advanced.enums.ex1;

//import com.sun.jdi.PathSearchingVirtualMachine;
//
import java.util.Scanner;

/**
 * ##### Enums Exercise 1
 *
 * Create enum Planet.
 *  - Override toString method. It should print relative size of a planet and it's name.
 * E.g. „Huge Jupiter", „Small Pluto".
 *  - Create distanceFromEarth method.
 *  - Verify both methods for multiple planets.
 */
public class Main {
    public static void main(String[] args) {

        Planet somePlanet = Planet.JUPITER; //nu se poate apela new pentru enumul este private

        System.out.println(" The planets known: ");

        for(Planet planet : Planet.values() ) {  // am facut un foreach pentru a enumera toate planetele din Planet
            System.out.println(planet.name()); // metoda . name nu am mai lasat toString sa printeze metoda, ci am fortat sa printeze numele  enumului
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insert a plannet name ");

        String value = scanner.nextLine().toUpperCase();

        Planet planetFromUser = Planet.valueOf(value);
        System.out.println(planetFromUser);
        System.out.println("Distance from Earth is: " + planetFromUser.getDistanceFromEarth());
    }
}
