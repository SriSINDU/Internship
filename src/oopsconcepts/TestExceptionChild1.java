package oopsconcepts;
class Parent1{
    void msg(){System.out.println("parent");}
}
public class TestExceptionChild1 extends Parent1 {
    void msg()throws ArithmeticException{
        System.out.println("child");
    }
    public static void main(String args[]){
        Parent1 p=new TestExceptionChild1();
        p.msg();
    }
}
