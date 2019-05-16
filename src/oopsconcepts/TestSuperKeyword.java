package oopsconcepts;
class Vehicle1
{
    int maxSpeed = 120;
    Vehicle1(){
        System.out.println("This is base class constructor");
    }
    void message()
    {
        System.out.println("This is Base class");
    }
}

/* sub class Car extending vehicle */
class Car extends Vehicle1
{
    int maxSpeed = 180;
    Car(){
        super();

    }
    void message()
    {
        System.out.println("This is child class");
    }
    void display()
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
        super.message();
    }
}

public class TestSuperKeyword {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
