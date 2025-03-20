package com.example.revision.Task_2;

public class Rectangle extends Shape {
    private double length;
    private double breadth;


    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }


    public Rectangle(double length, double breadth, String[] pointer) {
        super(pointer);
        this.length = length;
        this.breadth = breadth;
    }


    public Rectangle(Rectangle other) {
        super(other.getPointer());
        this.length = other.length;
        this.breadth = other.breadth;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }


    @Override
    public void draw() {
        double area = length * breadth;
        System.out.println("Rectangle has been drawn with area: " + area);
    }
}
