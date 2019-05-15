package oopsconcepts;
// java program to implement multi level and hierarchical inheritance
public class Intern extends Worker {
    int pf=8500;
    public static  void main(String[] args){
        Intern i=new Intern();
        i.printvalue();
        System.out.println("accesing from worker class"+i.salary);
    }


}
