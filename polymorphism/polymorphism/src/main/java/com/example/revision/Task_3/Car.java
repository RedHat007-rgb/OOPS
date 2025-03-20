package com.example.revision.Task_3;

public class Car extends Vechile{

    public Car(String brand){
        super(brand);
    }

    public Car(Car other){
        super(other.getBrand());
    }
    @Override
    public void start() {

        System.out.println("Car starting: Vroom!");
    }
}
