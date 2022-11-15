package com.sda.rares.advanced.recap.ex1;

import com.sda.rares.advanced.recap.ex1.model.AntivirusProduct;
import com.sda.rares.advanced.recap.ex1.model.GroceryProduct;
import com.sda.rares.advanced.recap.ex1.model.OsProduct;
import com.sda.rares.advanced.recap.ex1.model.PetFoodProduct;
import com.sda.rares.advanced.recap.ex1.repository.*;

import java.util.Date;

/**
 * # **Write a java application that simulates an online shop .**
 * ### Step by step exercises
 * <p>
 * **1. Encapsulation**
 * - create the class Account that encapsulates the fallowing data:
 * - id: String
 * - billingAddress: String
 * - isClosed: Boolean
 * - creationDate: Date
 * - closedDate: Date
 * - The class Account should have a constructor with all the files and getters for all the fields.
 * <p>
 * **2. Composition**
 * - create the class Customer that encapsulates the fallowing data:
 * - id: String
 * - address: String
 * - phone: String
 * - email: String
 * - an Account instance
 * - The class Customer should have a constructor with all the files and getters for all the fields.
 * <p>
 * **3. Enums**
 * - create the enum CustomerState with some values (New, Active, Closed, Banned).
 * Override the toString method to print the pretty name.
 * - create a method that should return if the state permits shopping
 * <p>
 * **4. Interface**
 * - create the interface Sellable with the fallowing methods:
 * - getPrice()
 * - getCurrency()
 * - getName()
 * - getDescription()
 * - getProductCategory()
 * <p>
 * **5. Abstarct class**
 * - create the abstract class FoodProduct  that implements Sellable and encapsulates the fallowing data:
 * - expirationDate: date
 * - isBio: boolean
 * - countryOfOrigin: String
 * - create a constructor that will accept all the fields as parameters
 * - add getters for all the fields
 * - (**OPTIONAL**) create the abstract SoftwareProduct that implements Sellable and encapsulates the fallowing data:
 * - receivedOnMail: boolean
 * - sentOnDvdDisk: boolean
 * - licenseType: String
 * - releasedBy: String
 * - create a constructor that will accept all the fields as parameters
 * - implement the method send on email
 * - add getters for releasedBy and licenseType
 * <p>
 * **6. Inheritance**
 * - create new classes that will inherit the FoodProduct class
 * - GroceryProduct
 * - (**OPTIONAL**) PetsFoodProduct
 * - (**OPTIONAL**) create new classes that will inherit the Software class:
 * - OsProduct
 * - AntivirusProduct
 * <p>
 * **7. Exceptions**
 * - Use exceptions to validate the data passes into constructors when
 * OsProduct,AntivirusProduct,GroceryProduct or PetsFoodProduct is called.
 * <p>
 * **8. Generic types**
 * - Create a generic interface for a repository that can hold items that are extending Sellable.
 * - This repository should have the fallowing methods:
 * - add(T)
 * - search(Id)
 * - remove(Id)
 * - get(Id)
 * <p>
 * **8. Collections (and Maps)**
 * - Create the implementation for the generic repository. Optimize the collection that will store the elements for all the existing actions.
 * <p>
 * **9. Input/Output**
 * - When the application is starting all the product repositories all loaded with data from the provided files.
 * - When a product is bought a new file should be created with the data about the order.
 * <p>
 * **9. Lambda expressions,Optionals,Streams**
 * - Use Lambda expressions,Optionals,Streams where the situation permit, for example:
 * - replace regular "for" with foreach
 * - use streams for sorting
 * - use Optional where return result from methods may be null
 * - use streams for sorting
 * - use streams to parse the data received from IO
 */
public class Main {
    public static void main(String[] args) {

        GroceryProductRepository groceryProductRepository = new GroceryProductRepositoryImpl();

        GroceryProduct groceryProduct = new GroceryProduct(
                new Date(),
                true,
                "Romania",
                "Milk",
                2.99,
                "organic"
        );

        groceryProductRepository.add(groceryProduct);
        System.out.println(groceryProductRepository.search(2.99));
        System.out.println(groceryProductRepository.search(5));
        System.out.println(groceryProductRepository.get("Milk"));
        System.out.println(groceryProductRepository.get("bread"));
        groceryProductRepository.remove("Milk");
        System.out.println(groceryProductRepository.get("Milk"));


        PetFoodProductRepository petFoodProductRepository = new PetFoodProductRepositoryImpl();
        PetFoodProduct petFoodProduct = new PetFoodProduct(
                new Date(),
                true,
                "USA",
                "dog food",
                5.566,
                "made from fish"
        );

        petFoodProductRepository.add(petFoodProduct);
        System.out.println(petFoodProductRepository.search(5.566));
        System.out.println(petFoodProductRepository.search(8));
        System.out.println(petFoodProductRepository.get("dog food"));


        OsProductRepository osProductRepository = new OsProductRepositoryImpl();
        OsProduct osProduct = new OsProduct(
                true,
                false,
                "os887",
                "apple",
                "ios20",
                102.55,
                "expensive"
        );

        osProductRepository.add(osProduct);
        System.out.println(osProductRepository.search(102.55));


        AntivirusProductRepository antivirusProductRepository = new AntivirusProductRepositoryImpl();
        AntivirusProduct antivirusProduct = new AntivirusProduct(
                true,
                true,
                "123",
                "microsoft",
                "win11",
                10.5,
                "cheap"
        );

        antivirusProductRepository.add(antivirusProduct);
        System.out.println(antivirusProductRepository.search(10.5));
    }
}