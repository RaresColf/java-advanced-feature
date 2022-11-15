package com.sda.rares.advanced.exceptions.ex2.repository;

import com.sda.rares.advanced.exceptions.ex2.exceptions.CarNotFoundException;
import com.sda.rares.advanced.exceptions.ex2.model.Car;

public class CarRepositoryInMemory implements CarRepository {

    private Car[] cars = new Car[0];


    @Override
    public void addCar(Car car) {
        Car[] tempCars = new Car[cars.length + 1];
        for (int i = 0; i < cars.length; i++) {
            tempCars[i] = cars[i];
        }
        tempCars[tempCars.length - 1] = car;
        cars = tempCars;
    }

    @Override
    public void deleteCar(Car car) throws CarNotFoundException {
        int indexOfCar = -1;
        for (int i = 0; i < cars.length; i++) {
            if (car.getId().equals(cars[i].getId())) {
                indexOfCar = i;
                break;
            }
        }
        if (indexOfCar == -1) {
            throw new CarNotFoundException("Car not found with id " + car.getId());
        }
        Car[] tempCars = new Car[cars.length - 1];
        int j = 0;
        for (int i = 0; i < cars.length; i++) {
            if (indexOfCar != i) {
                tempCars[j] = cars[i];
                j += 1;
            }
        }
        cars = tempCars;
    }

    @Override
    public Car searchCarByName(String carName) throws CarNotFoundException {
        for (Car car : cars) {
            if (carName.equals(car.getName())) {
                return car;
            }
        }
        throw new CarNotFoundException("Car not found with name " + carName);
    }

    @Override
    public Car searchById(String carId) throws CarNotFoundException {
        for (Car car : cars) {
            if (carId.equals(car.getId())) {
                return car;
            }
        }
        throw new CarNotFoundException("Car not found with id " + carId);
    }

    @Override
    public void removeCarById(String carId) throws CarNotFoundException {
        throw new IllegalStateException(" Homework - similar with removeCar");
    }
}
