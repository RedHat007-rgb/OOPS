//DVD class:


package org.example;

public class DVD extends LibraryItem{
    private int duration;

    public DVD(String title, int id, boolean isBorrowed, int duration) {
        super(title, id, isBorrowed);
        this.duration = duration;
    }

    public DVD(DVD other){
        super(other);
        this.duration= other.duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void DisplayInfo() {
        System.out.println("..........DVD.............");
        System.out.println("Name:"+getTitle());
        System.out.println(("id"+getId()));
        System.out.println(("isBorrowed"+isBorrowed()));
        System.out.println("pages:"+getDuration());
    }
}
