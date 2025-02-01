package com.example;

public class librarian extends User{
    private String employeeNumber;


    public librarian(String name,String contactInfo,String employeeNumber){
        super(name,contactInfo);
        this.employeeNumber=employeeNumber;
    }
    
    public void displayDashboard() {
        System.out.println("Librarian Dashboard........");
        System.out.println("Name of the Librarian:"+getName());
        System.out.println("Employee number"+employeeNumber);
    }

    
    public boolean canBorrowBooks() {
        return true;
    }

    public void addNewBook(Book book){

    }

    public void removeBook(Book Book){

    }
}
