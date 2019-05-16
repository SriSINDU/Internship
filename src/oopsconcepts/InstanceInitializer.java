package oopsconcepts;

class BaseA{
    BaseA(){
        System.out.println("parent class constructor invoked");
    }
}
public class InstanceInitializer extends BaseA {
    InstanceInitializer(){
        super();
        System.out.println("child class constructor invoked");
    }

    {System.out.println("instance initializer block is invoked");}

    public static void main(String args[]) {
        InstanceInitializer b = new InstanceInitializer();
    }

    }
