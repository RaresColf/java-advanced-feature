package com.sda.rares.advanced.recap.ex1.model;

import com.sda.rares.advanced.recap.ex1.model.exceptions.InvalidProductDetailsException;

import java.util.Date;

public class GroceryProduct extends FoodProduct{

    private String name;
    private double price;
    private String description;


    public GroceryProduct(Date expirationDate, boolean isBio, String countryOfOrigin,
                          String name, double price, String description) {
        super(expirationDate, isBio, countryOfOrigin);
        setName(name);
        setPrice(price);
        setDescription(description);
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else{
            throw new InvalidProductDetailsException("Invalid product name");
        }

    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        } else{
            throw new InvalidProductDetailsException("Invalid product price");
        }

    }

    public void setDescription(String description) {
        if(description != null && !description.isEmpty()){
            this.description = description;
        } else {
            throw new InvalidProductDetailsException("Invalid description");
        }

    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public int compareTo(Sellable other) {
        return Double.compare(this.getPrice(),other.getPrice());
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    //clasa e non abstracta pentru ca am implementat toate clasele abstracte din parinte
}
