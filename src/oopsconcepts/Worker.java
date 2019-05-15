package oopsconcepts;
// program to illustraate  simple inheritance
public class Worker  extends Employee{
    int salary=10000;
    public static void main(String[] args){
        Worker w=new Worker();
        System.out.println("argument defined in derived class "+w.salary);
        System.out.println("argument defined in Base class "+w.bonus);
    }
}
