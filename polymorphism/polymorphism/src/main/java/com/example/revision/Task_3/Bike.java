package com.example.revision.Task_3;

public class Bike extends Vechile{


    public Bike(String brand){
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Bike starting: Beep!");
    }
}
