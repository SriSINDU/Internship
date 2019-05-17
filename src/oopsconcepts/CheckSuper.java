package oopsconcepts;

public class S{
    private  int a=10;
    protected int b;
}
public class CheckSuper extends S{
    int a=20;
    void display(){
        System.out.println(super.a);
    }
   public static void main(String[] args){
        CheckSuper cs=new CheckSuper();
        cs.display();
   }

}
