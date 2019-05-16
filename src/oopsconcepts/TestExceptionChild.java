package oopsconcepts;
class Parent{
    void msg(){System.out.println("parent");}
}
public class TestExceptionChild  extends Parent{
    void msg(){
        System.out.println("TestExceptionChild");
    }
    public static void main(String args[]){
        Parent p=new TestExceptionChild();
        p.msg();
    }

}
