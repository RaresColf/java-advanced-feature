package com.sda.rares.advanced.recap.ex1.model;

import java.util.Date;

public abstract class FoodProduct implements Sellable {
    //limitarea clasei abstracte este ca  nu poate fi instantiata

    private Date expirationDate;
    private boolean isBio;
    private String countryOfOrigin;

    public FoodProduct(Date expirationDate, boolean isBio, String countryOfOrigin) {
        // TODO : add validation on expiration date si country of origin
        this.expirationDate = expirationDate;
        this.isBio = isBio;
        this.countryOfOrigin = countryOfOrigin;
    }

    // incercam sa ne mai scapam de metode, si presupunem ca moneda este tot timpul euro


    @Override
    public String getCurrency() {
        return "EUR";
    }

    @Override
    public String getProductCategory() {
        return "food";
    }

    // in continuare FoodProduct ramane abstracta pentru ca nu am putut supracrie toate metodele abstracte

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    @Override
    public String toString() {
        return "FoodProduct{" +
                "expirationDate=" + expirationDate +
                ", isBio=" + isBio +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                '}';
    }
}
