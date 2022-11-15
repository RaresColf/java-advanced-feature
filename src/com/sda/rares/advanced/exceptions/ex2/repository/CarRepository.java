package com.sda.rares.advanced.exceptions.ex2.repository;

import com.sda.rares.advanced.exceptions.ex2.exceptions.CarNotFoundException;
import com.sda.rares.advanced.exceptions.ex2.model.Car;

public interface CarRepository {

    void addCar(Car car);
    void deleteCar(Car car) throws CarNotFoundException;
    Car searchCarByName(String carName) throws CarNotFoundException; // folosim Car deoarece din calsa car vrem sa cautam
    Car searchById(String carId) throws CarNotFoundException;    // folosim Car deoarece din calsa car vrem sa cautam
    void removeCarById(String carId) throws CarNotFoundException;
}
