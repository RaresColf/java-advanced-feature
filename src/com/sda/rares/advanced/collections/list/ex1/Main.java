package com.sda.rares.advanced.collections.list.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ##### Collections LIST Exercise 1
 * <p>
 * Create a List and display its result (data should be provided by the user - console):
 * - Purchases to be made. *If an element already exists on the list, then it should not be added.
 * - *Add to the example above the possibility of "deleting" purchased elements
 * - Display only those purchases that start with „m" (e.g. milk)
 * - *View only purchases whose next product on the list starts with „m" (e.g. eggs, if milk was next on the list)
 */
public class Main {
    public static void main(String[] args) {

        List<String> shoppingList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        String option = "";
        do {
            System.out.println("Please select an option: ");
            option = scanner.nextLine();

            switch (option) {
                case "add":
                    System.out.println("Please add a product to the list : ");
                    String product = scanner.nextLine();
                    if (!shoppingList.contains(product)) {
                        shoppingList.add(product);
                    } else {
                        System.out.println("Product allready in the basket ");
                    }
                    break;
                case "show":
                    for (String productShow : shoppingList) {
                        System.out.println("-" + productShow);
                    }
                    break;

                default:
                    System.out.println("Option not found ");
                    break;

                case "delete":
                    System.out.println("Please select an product to be deleted ");
                    String productDelete = scanner.nextLine();
                    shoppingList.remove(productDelete);

                    break;


                case "showAs":
                    System.out.println("Please insert a prefix ");
                    String prefix = scanner.nextLine();
                    for (String productShow : shoppingList) {
                        if (productShow.startsWith(prefix)) {
                            System.out.println("-" + productShow);
                        }
                    }
                    break;

                case "showNextOfStartingList":
                    System.out.println("Plsease insert a prefix: ");
                    String prefix2 = scanner.nextLine();
                    for (int i = 0; i < shoppingList.size(); i++) {
                        if(shoppingList.get(i).startsWith(prefix2)) {
                            if (i < shoppingList.size() - 1) {
                                System.out.println("-" + shoppingList.get(i + 1));
                            }
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Goodbye");

                    break;

            }

        } while (!option.equals("exit"));
    }
}

