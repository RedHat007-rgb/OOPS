package com.example;



public abstract class User {
    private String userId;
    private String name;
    private String contactInfo;
    private static int totalUsers=0;

    User(){
        userId=generateID();
    }

    User(String name,String conatactInfo){
        this.userId=generateID();
        this.name=name;
        this.contactInfo=conatactInfo;
    }

    User(User user){
        this.userId=generateID();
        this.name=user.name;
        this.contactInfo=user.contactInfo;
    }

    private final String generateID(){
        totalUsers=totalUsers+1;
        return "UserID:"+totalUsers;
    }

    public abstract void displayDashboard();
    public abstract boolean canBorrowBooks();

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    
}