package oopsconcepts;
class A{
    A get(){return this;}
}

public class CovariantType extends A {
    CovariantType  get(){return this;}
    void message(){System.out.println("welcome to covariant return type");}

    public static void main(String args[]){
        new CovariantType().get().message();
    }
}
