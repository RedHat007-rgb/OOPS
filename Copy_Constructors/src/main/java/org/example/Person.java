//Shallow Copy with References
//* Challenge: Create a Person class with String name and int[] scores. Implement a shallow copy constructor.
//Test it by modifying the scores array in the copy and checking if the original changes.
//* Goal: Observe the shared reference behavior of shallow copy.


package org.example;

public class Person {
    String name;
    int[] scores;

    public Person(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }


    public Person(Person other){
        this.name=other.name;
        this.scores=other.scores;
    }
}
