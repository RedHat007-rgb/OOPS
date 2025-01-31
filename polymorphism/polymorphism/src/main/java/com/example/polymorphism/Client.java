package com.example.polymorphism;

import java.util.Scanner;

public class Client {
    
    public static void main(String[] args) {
        // Animal animal=new Animal();
        Scanner sc=new Scanner(System.in);
        System.out.println("Tell me which animal u want");
        String animaltype=sc.nextLine();
        Animal animal1=null;
        if(animaltype.equalsIgnoreCase("cat")){
            animal1=new Cat();
        }else if(animaltype.equalsIgnoreCase("dog")){
            animal1=new Dog();
        }
        AnimalUTility.doSomething(animal1);

    }
}
