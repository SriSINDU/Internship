package oopsconcepts;
//Java Program to illustrate the use of Java Method Overriding
//Creating a parent class.
class Vehicle{
    void run(){System.out.println("Vehicle is running");}
}
public class Bike extends Vehicle {
    //defining the same method as in the parent class
    void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String args[]){
        Bike obj = new Bike();
        obj.run();
    }

}
