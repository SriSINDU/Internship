import java.util.*;
public class Person {
    int age;
    Person(int intialAge){
        if(intialAge>0){
            age=intialAge;
        }
        else{
            age=0;
            System.out.println("Age is not valid, setting age to 0..");
        }
    }
    void yearPasses(){
        age++;
    }
    void amIOld(){
        if(age<13){
            System.out.println("you are Young...");
        }
        else if(age>=13 && age<18){
            System.out.println("You are Teenager");
        }
        else{
            System.out.println("You are Old");
        }
    }
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
         int t=s.nextInt();
         for(int i=0;i<t;i++){
             int ag=s.nextInt();
             Person p=new Person(ag);
             p.amIOld();
             p.yearPasses();
             p.yearPasses();
             p.yearPasses();
             p.amIOld();


         }
    }
}
