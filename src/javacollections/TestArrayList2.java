package javacollections;
import java.util.*;
class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
public class TestArrayList2 {
    public static void main(String args[]){
        //Creating user-defined class objects
        Student s1=new Student(101,"Sindhu",21);
        Student s2=new Student(102,"aman",22);
        Student s3=new Student(103,"Mohan",23);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        System.out.println(al.get(0).toString());
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

