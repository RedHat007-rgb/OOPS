
//* Challenge: Write a Car class with fields String model and int year.
// Implement a copy constructor and test it by creating an original Car and a copy, then modifying the copy’s model. Print both to confirm they’re independent.
// * Goal: Understand how a basic copy constructor duplicates primitive and immutable fields.


package org.example;

public class Car {
    String model;
    int year;

    public Car(Car other){
        this.model=other.model;
        this.year=other.year;
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
}
