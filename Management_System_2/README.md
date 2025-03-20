Library Management System

📌 Project Description

The Library Management System is a simple Java application that demonstrates polymorphism, inheritance, and copy constructors. It allows managing books and media items with borrowing functionality.

🏗️ Features

Base Class: LibraryItem

Stores common attributes like title, id, and isBorrowed.

Implements a shallow copy constructor.

Provides a displayInfo() method, which is overridden by subclasses.

Subclasses:

Book (extends LibraryItem)

Adds pages attribute.

Implements a deep copy constructor.

Overrides displayInfo() to display book details.

DVD (extends LibraryItem)

Adds duration (in minutes).

Implements a shallow copy constructor.

Overrides displayInfo() to display DVD details.

Utility Class: LibraryManager

addItem(LibraryItem item): Overloaded method for adding Book and DVD.

displayAllItems(LibraryItem[] items): Uses polymorphism to display all library items.

🏃‍♂️ How It Works

Create objects for Book and DVD.

Perform deep copy on Book and shallow copy on DVD.

Modify copies (e.g., mark book as borrowed, change DVD title).

Store all items in a LibraryItem array.

Display all items using polymorphism.

📦 Installation & Execution

Compile the Java files:

javac LibraryItem.java Book.java DVD.java LibraryManager.java Main.java

Run the program:

java Main

📝 Sample Output

Book: The Great Gatsby, ID: 101, Pages: 180, Borrowed: false
DVD: Inception, ID: 202, Duration: 148 mins, Borrowed: false
Copied Book borrowed.
DVD title changed.
Book: The Great Gatsby (Copy), ID: 103, Pages: 180, Borrowed: true
DVD: Interstellar, ID: 202, Duration: 148 mins, Borrowed: false

🔑 Key Concepts Used

✅ Inheritance (Book & DVD inherit from LibraryItem)
✅ Method Overriding (displayInfo() is overridden)
✅ Polymorphism (LibraryManager handles different types)
✅ Deep Copy vs Shallow Copy (Book uses deep copy, DVD uses shallow copy)


