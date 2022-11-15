package com.sda.rares.advanced.recap.ex1.model;

public class OsProduct extends SoftwareProduct{

    private String name;
    private double price;
    private String description;

    public OsProduct(boolean receivedOnMail, boolean sentOnDvdDisk, String licenseType, String releasedBy, String name, double price, String description) {
        super(receivedOnMail, sentOnDvdDisk, licenseType, releasedBy);
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()){
            this.name = name;
        } else{
            System.out.println("Invalid name");
        }

    }

    public void setPrice(double price) {
        if(price >0 ) {
            this.price = price;
        } else{
            System.out.println("Invalid price");
        }
    }

    public void setDescription(String description) {
        if(description == null && !description.isEmpty()){
            this.description = description;
        }else{
            System.out.println("Invalid description");
        }

    }

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public int compareTo(Sellable oter) {
        return Double.compare(this.getPrice(), oter.getPrice());
    }

    @Override
    public String toString() {
        return "OsProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
