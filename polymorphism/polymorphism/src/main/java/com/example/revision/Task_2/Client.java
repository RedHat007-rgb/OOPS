package com.example.revision.Task_2;

import java.util.Arrays;

public class Client {


    public static void main(String[] args) {
        String[] originalPointers = {"A", "B", "C"};

        Circle originalCircle = new Circle(5.0, originalPointers);
        System.out.println("Original Circle:");
        originalCircle.draw();
        System.out.println("Pointer Array: " + Arrays.toString(originalCircle.getPointer()));


        Circle copiedCircle = new Circle(originalCircle);
        System.out.println("\nCopied Circle:");
        copiedCircle.draw();
        System.out.println("Pointer Array: " + Arrays.toString(copiedCircle.getPointer()));




    }
}
