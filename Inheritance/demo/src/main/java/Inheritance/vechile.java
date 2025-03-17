// Task 1: Basic Inheritance
// Challenge: Create a Vehicle class with fields String brand and int speed, and a method move(). 
// Create a Car subclass that inherits from Vehicle, adds a field int doors, and overrides move() to include doors in the output. 
// Test it in a Main class.

package Inheritance;

public class vechile {
    private String brand;
    private int speed;

    
    public void move(){
        System.out.println("vechile is moving.....");
    }


    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    
    

}
