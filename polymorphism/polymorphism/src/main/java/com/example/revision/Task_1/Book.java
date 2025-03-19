package com.example.revision.Task_1;

public class Book {
    private String title;
    private int pages;



    public Book(){}

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public Book(Book other){
        this.title=other.title;
        this.pages=other.pages;
    }

    public Book(Book other,String newTitle){
        this.title=newTitle;
        this.pages=other.pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pages=" + pages +
                '}';
    }
}
