package com.example.revision.Task_3;

public class Client {
    public static void main(String[] args) {
        Vechile[] vechile=new Vechile[2];
        vechile[0]=new Car("toyota");
        vechile[1]=new Bike("yamaha");

        for(int i=0;i< vechile.length;i++){
            vechile[i].start();
        }

        Car car1=new Car("lexus");
        Car car2=new Car(car1);
        System.out.println("brand:"+car1.getBrand());
        System.out.println("brand:"+car2.getBrand());



    }
}
