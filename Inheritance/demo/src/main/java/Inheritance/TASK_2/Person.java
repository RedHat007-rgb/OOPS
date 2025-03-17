// Task 2: Constructor Chaining
// Challenge: Build a Person class with String name and int age, and a constructor to set them. 
// Create an Employee subclass with an additional String jobTitle. 
// Use super() to initialize name and age, and test it. Print the employee details.
// Goal: Master constructor inheritance with super().

package Inheritance.TASK_2;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
