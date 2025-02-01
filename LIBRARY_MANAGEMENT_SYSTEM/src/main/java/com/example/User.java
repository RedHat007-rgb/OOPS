package com.example;



public abstract class User {
    private String UserId;
    private String name;
    private String contactInfo;

    public User(){
    this.UserId=generateUniqueId();
        
    }

    public User(String name,String contactInfo){
        UserId=generateUniqueId();
        this.name=name;
        this.contactInfo=contactInfo;
    }


    public User(User user){
        this.UserId=generateUniqueId();
        this.name=user.name;
        this.contactInfo=user.contactInfo;
    }


    abstract void dispalyDashboard();
    abstract boolean canBorrowBooks();

    public String getUserId(){
        return UserId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }


    private String generateUniqueId(){
        return "";
    }





}