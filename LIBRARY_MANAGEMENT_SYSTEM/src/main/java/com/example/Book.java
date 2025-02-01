package com.example;

public abstract class Book implements Lendable{
    private String isbn;
    private String title;
    private String author;
    private boolean isavailable;

    public Book(){
        isavailable=true;
    }

    public Book(String isbn,String title,String author,boolean isavailable){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
        this.isavailable=isavailable;
    }

    public Book(Book book){
        this.title=book.title;
        this.author=book.author;
        this.isbn=book.isbn;
        this.isavailable=book.isavailable;
    }



      public boolean lend(User user){
        
        if(isavailable && user.canBorrowBooks()){
            System.out.println("Yes the book is avilable");

            return true;
        }
        return false;
      }
     public void returnBook(User user){
        
     };
     public boolean isAvailable(){
        return true;
     }
   




}
