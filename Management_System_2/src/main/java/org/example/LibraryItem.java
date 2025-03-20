//Library item class:

package org.example;



public class LibraryItem {

    private String title;
    private int id;
    private boolean isBorrowed;

    public LibraryItem(){}



    public LibraryItem(String title, int id, boolean isBorrowed) {
        this.title = title;
        this.id = id;
        this.isBorrowed = isBorrowed;
    }

    public LibraryItem(LibraryItem other){
        this.title=other.title;
        this.id=other.id;
        this.isBorrowed=other.isBorrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public void DisplayInfo(){
        System.out.println("Title:"+title);
        System.out.println("Id:"+id);
        System.out.println("isBorrowed:"+isBorrowed);
    }
}
