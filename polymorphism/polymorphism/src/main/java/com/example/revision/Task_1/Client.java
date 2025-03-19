package com.example.revision.Task_1;

public class Client {
    public static void main(String[] args) {
        Book book1=new Book("JAva",90);
        Book book2=new Book(book1);
        Book book3= new Book(book2,"Python");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());



    }
}
