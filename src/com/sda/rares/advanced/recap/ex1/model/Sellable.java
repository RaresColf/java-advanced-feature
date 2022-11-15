package com.sda.rares.advanced.recap.ex1.model;

public interface Sellable extends Comparable<Sellable>{
    //toate field sunt publice si statice
    //toate metodele sunt abstracte cu excep metodelor default

    double getPrice();
    String getCurrency();
    String getName();
    String getDescription();
    String getProductCategory();
}
