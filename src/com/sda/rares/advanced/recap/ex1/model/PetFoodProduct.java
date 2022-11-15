package com.sda.rares.advanced.recap.ex1.model;

import java.util.Date;

public class PetFoodProduct extends FoodProduct{
    private String name;
    private double price;
    private String description;

    public PetFoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin, String name, double price, String description) {
        super(expirationDate, isBio, countryOfOrigin);
        // TODO : add validation
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int compareTo(Sellable other) {
        return Double.compare(this.getPrice(),other.getPrice());
    }

    @Override
    public String toString() {
        return "PetFoodProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    //clasa e non abstracta pentru ca am implementat toate clasele abstracte din parinte
}
