package com.example;

public class member extends User{
    private  int borrowedBookCount;
    private final int MAX_BORROW_LIMIT=5;


    public member(){}

    public member(String name,String conatactInfo,int borrowedBookCount) {
        super(name, conatactInfo);
        this.borrowedBookCount = borrowedBookCount;
    }


    @Override
    public void displayDashboard(){
        System.err.println("Member DAshboard.......");
        System.out.println("Name of the User:"+getName());
        System.out.println("ContactInfo"+getContactInfo());


    }
    @Override
    public boolean canBorrowBooks() {
        return borrowedBookCount<MAX_BORROW_LIMIT;
    }


    public void addNewBook(Book book){

    }

    public void removeBook(Book Book){

    }

}
