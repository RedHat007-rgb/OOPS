package com.example.revision.Task_2;

public class Circle extends Shape {
    private double radius;


    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String[] pointer) {
        super(pointer);
        this.radius = radius;
    }


    public Circle(Circle other) {
        super(other.getPointer());
        this.radius = other.radius;
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public void draw() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle has been drawn with area: " + area);
    }
}
