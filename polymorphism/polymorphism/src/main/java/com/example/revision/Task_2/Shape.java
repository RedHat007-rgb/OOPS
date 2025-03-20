package com.example.revision.Task_2;



public class Shape {
    private String[] pointer;


    public Shape() {
    }


    public Shape(String[] pointer) {
        if (pointer != null) {
            this.pointer = new String[pointer.length];
            for (int i = 0; i < pointer.length; i++) {
                this.pointer[i] = pointer[i];
            }
        }
    }


    public String[] getPointer() {
        return pointer;
    }

    public void draw() {
        System.out.println("Drawing a shape...");
    }
}
