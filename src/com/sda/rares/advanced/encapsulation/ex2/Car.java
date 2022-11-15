package com.sda.rares.advanced.encapsulation.ex2;

//import jdk.dynalink.beans.StaticClass;
//import java.security.PrivateKey;

public class Car {
    private String identificationNumber;
    private String carPlate;
    private String model;
    private String brand;
    private String engineDescription;

    public Car(String identificationNumber, String carPlate, String model,
               String brand, String engineDescription) {
        this.identificationNumber = identificationNumber;
        this.carPlate = carPlate;
        this.model = model;
        this.brand = brand;
        this.engineDescription = engineDescription;
    }

    public Car(String identificationNumber, String carPlate) {
        this.identificationNumber = identificationNumber;
        this.carPlate = carPlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getEngineDescription(){
        return engineDescription;
    }

    public void setEngineDescription(String engineDescription){
        this.engineDescription = engineDescription;
    }

    @Override
    public String toString() {
        return "Car{" +
                "identificationNumber='" + identificationNumber + '\'' +
                ", carPlate='" + carPlate + '\'' +
                ", model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", engineDescription='" + engineDescription + '\'' +
                '}';
    }
}
