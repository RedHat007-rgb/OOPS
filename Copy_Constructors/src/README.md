Overview

This project explores different ways to copy objects in Java, including copy constructors, shallow copies, and deep copies. It covers essential concepts through structured tasks, helping developers understand object duplication and reference management.

Tasks

Task 1: Basic Copy Constructor

Challenge:

Implement a Car class with String model and int year.

Create a copy constructor.

Test by modifying the copied instance’s model and confirming independence.

Goal:

Understand how a copy constructor works with primitive and immutable fields.

Task 2: Shallow Copy with References

Challenge:

Create a Person class with String name and int[] scores.

Implement a shallow copy constructor.

Test by modifying scores in the copy and observing changes in the original.

Goal:

Recognize how shallow copying affects reference types.

Task 3: Deep Copy Implementation

Challenge:

Modify Person to use a deep copy constructor.

Manually duplicate the scores array.

Test by modifying the copied scores and verifying the original remains unchanged.

Goal:

Master creating independent copies of reference-type fields.

Task 4: Nested Objects

Challenge:

Design a Department class with String name and a List<Employee>.

Implement both shallow and deep copy constructors.

Test by adding an Employee to the copy’s list and checking the original.

Goal:

Understand how to handle nested object structures and compare shallow vs. deep copies.

Task 5: Clone Method Exploration

Challenge:

Implement the Cloneable interface in Car from Task 1.

Override clone() to perform a shallow copy.

Extend it to a deep copy by adding a String[] features field and duplicating it.

Test both versions.

Goal:

Compare copy constructors to clone() and practice deep copying using Java’s built-in mechanism.

How to Run

Clone this repository.

Open the project in your preferred IDE.

Implement and test each task in sequence.

Run test cases to verify behavior.

Key Learnings

The difference between shallow and deep copying.

How copy constructors work with primitive and reference types.

How to implement Cloneable and override clone().

Handling complex nested structures in object copying.

Happy Coding!