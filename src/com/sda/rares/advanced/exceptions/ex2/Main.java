package com.sda.rares.advanced.exceptions.ex2;

import com.sda.rares.advanced.exceptions.ex2.exceptions.CarNotFoundException;
import com.sda.rares.advanced.exceptions.ex2.model.Car;
import com.sda.rares.advanced.exceptions.ex2.repository.CarRepository;
import com.sda.rares.advanced.exceptions.ex2.repository.CarRepositoryInMemory;

/**
 * ##### Exceptions Exercise 2
 *
 * Create the CarRepository class, which will be responsible for:
 * - adding Car objects
 * - removing Car objects
 * - searching for objects of the Car type with the indicated name
 * - searching for objects of the Car type with the indicated id
 * - removing objects of the Car type based on the provided id
 *
 * The Car class should include the following:
 * - id
 * - name
 * - year of production
 *
 * In case of lack of searched results an exception should be thrown. This
 * exception should accept the String parameter object with information about
 * which elements could not be found.
 */
public class Main {
    public static void main(String[] args) {

        CarRepository carRepository = new CarRepositoryInMemory();
        Car car1 = new Car("125","Car1",2022);
        Car car2 = new Car("334","Car2",2020);
        Car car3 = new Car("445","Car3",2012);

        carRepository.addCar(car1);
        carRepository.addCar(car2);
        carRepository.addCar(car3);

        try {
            System.out.println(carRepository.searchById("125"));
        } catch (CarNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(carRepository.searchById("555"));

        }catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(carRepository.searchCarByName("Car3"));
        } catch (CarNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(carRepository.searchCarByName("Car4"));

        }catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            carRepository.deleteCar(car1);
        } catch (CarNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(carRepository.searchById("125"));
        } catch (CarNotFoundException e){
            System.out.println(e.getMessage());
        }


    }
}