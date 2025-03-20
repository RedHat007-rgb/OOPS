package org.example;

public class Main {
    public static void main(String[] args) {
        LibraryManager libraryManager = new LibraryManager();

        // Create Book
        Book book1 = new Book("Java Programming", 101, false, 450);
        Book bookCopy = new Book(book1); // Deep Copy
        bookCopy.setBorrowed(true); // Modifying the copy

        // Create DVD
        DVD dvd1 = new DVD("Inception", 202, false, 148);
        DVD dvdCopy = new DVD(dvd1); // Shallow Copy
        dvdCopy.setTitle("Interstellar"); // Modifying the copy

        // Add items to LibraryManager
        libraryManager.addItem(book1);
        libraryManager.addItem(bookCopy);
        libraryManager.addItem(dvd1);
        libraryManager.addItem(dvdCopy);
        System.out.println(System.identityHashCode(book1.getTitle()));
        System.out.println(System.identityHashCode(bookCopy.getTitle()));

        // Display all items
        System.out.println("\nDisplaying All Library Items:");
        libraryManager.displayAllItems();
    }
}

