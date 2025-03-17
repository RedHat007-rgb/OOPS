package Inheritance;
// Toyota is moving at 60 mph with 4 doors.
public class car extends vechile{
    private int doors;
    public car(int doors,int speed,String brand){
        setSpeed(speed);
        setBrand(brand);
        this.doors=doors;
    }
    @Override
    public void move() {
        System.out.println(getBrand()+" is moving at "+getSpeed()+" with " +doors + " doors ");
    }

    

}
