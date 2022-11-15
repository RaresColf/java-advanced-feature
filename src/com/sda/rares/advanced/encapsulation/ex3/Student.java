package com.sda.rares.advanced.encapsulation.ex3;

public class Student {

    private String firstName;
    private String lastName;
    private String classRoom;
    private double averageGrade;

    public Student(String firstName, String lastName, String classRoom, double averageGrade){
        setFirstName(firstName);
        setLastName(lastName);
        setClassRoom(classRoom);
        setAverageGrade(averageGrade);
    }

    public Student(String firstName, String lastName, String classRoom) {
        this(firstName, lastName, classRoom, 10.00); // aici nu sunt sigur ca am facut bine
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        if(firstName == null || firstName.isEmpty() || firstName.length()<= 0){
            System.err.println("Invalid First Name ");
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        if(lastName == null || lastName.isEmpty() || lastName.length()<= 0){
            System.err.println("Invalid Last Name ");
        } else {
            this.lastName = lastName;
        }
    }

    public String getClassRoom(){
        return classRoom;
    }
    public void setClassRoom(String classRoom){
        if(classRoom == null || classRoom.isEmpty() || classRoom.length()<= 0){
            System.err.println("Invalid First Name ");
        } else {
            this.classRoom = classRoom;
        }
    }

    public double getAverageGrade(){
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade){
        if(averageGrade <= 0){                 // nu-mi apare mesajul "invalid average grade"
            System.err.println("Invalid Average Grade ");
        } else {
            this.averageGrade = averageGrade;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", averageGrade=" + averageGrade +
                '}';
    }
}
