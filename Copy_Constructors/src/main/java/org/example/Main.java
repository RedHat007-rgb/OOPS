package org.example;

import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Car car1=new Car("Skoda Rapid",2016);
//        System.out.println(car1);
//        Car car2=new Car(car1);
//        System.out.println(car2);
//        car2.year=2025;
//        System.out.println("Car1 year: "+car1.year);
//        System.out.println("Car2 year: "+car1.year);

        //.................................................................//

        Person person1=new Person("Preetham",new int[]{23, 4, 5});

        Person person2=new Person(person1);
        System.out.println(person1);
        System.out.println(person2);
        person2.scores[2]=90;
        person2.name="Reddy";
        System.out.println(Arrays.toString(person1.scores));
        System.out.println(Arrays.toString(person2.scores));
        System.out.println((person1.name));
        System.out.println((person2.name));






    }
}