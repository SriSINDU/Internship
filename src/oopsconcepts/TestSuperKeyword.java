package oopsconcepts;
class Vehicle1
{
    int maxSpeed = 120;
}

/* sub class Car extending vehicle */
class Car extends Vehicle1
{
    int maxSpeed = 180;
    void display()
    {
        /* print maxSpeed of base class (vehicle) */
        System.out.println("Maximum Speed: " + super.maxSpeed);
    }
}

public class TestSuperKeyword {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
