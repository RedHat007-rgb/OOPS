//Book class

package org.example;

public class Book extends LibraryItem{
    private int pages;

    public Book(int pages) {
        this.pages = pages;
    }

    public Book(String title, int id, boolean isBorrowed, int pages) {
        super(title, id, isBorrowed);
        this.pages = pages;
    }

    public Book(){}

    public Book(Book other){
        super(other.getTitle(), other.getId(), other.isBorrowed());
        this.pages=other.pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }


    @Override
    public void DisplayInfo() {
        System.out.println("..........Book.............");
        System.out.println("Name:"+getTitle());
        System.out.println(("id"+getId()));
        System.out.println(("isBorrowed"+isBorrowed()));
        System.out.println("pages:"+getPages());
    }
}
