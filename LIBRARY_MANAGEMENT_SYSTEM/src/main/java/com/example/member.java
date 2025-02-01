package com.example;


public class member extends User{
    private  int borrowedBookCount;
    private final int MAX_BORROW_LIMIT=5;


    public member(){
        super();
        borrowedBookCount=0;
    }

    public member(String name,String conatactInfo) {
        super(name, conatactInfo);
        borrowedBookCount=0;
    }


    
    public void displayDashboard(){
        System.err.println("Member DAshboard.......");
        System.out.println("Name of the User:"+getName());
        System.out.println("ContactInfo"+getContactInfo());
        System.out.println("Borrowed books:"+borrowedBookCount);


    }
    
    public boolean canBorrowBooks() {
        return borrowedBookCount<MAX_BORROW_LIMIT;
    }


    

}

