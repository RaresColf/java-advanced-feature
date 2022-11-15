package com.sda.rares.advanced.encapsulation.ex1;

public class Dog {
    private String name;
    private int age;
    private String gender;
    private String race;
    private double weight;

    public Dog(String name, int age, String gender, String race, double weight) {
        this.name = name;
        setAge(age); // face aceeasi validare ca si jos in setter
        this.gender = gender;
        this.race = race;
        setWeight(weight); // face aceeasi validare ca si jos in setter
    }

    public Dog(String gender, String race) {
        this("Dog", 0, gender, race, 0.1);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.err.println(" Invalid age ");
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0 && weight < 150) {
            this.weight = weight;
        } else {
            System.err.println(" Invalid weight ");
        }

    }

    // daca nu am metoda toString nu se va printa frumos stringul nostru :)
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", race='" + race + '\'' +
                ", weight=" + weight +
                '}';
    }
}
