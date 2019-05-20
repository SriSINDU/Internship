package javacollections;
import java.util.*;

public class TestArrayList1 {
    public static void main(String[] args){
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Sindhu");
        ar.add("Varsha");
        ar.add(1,"vijay");
        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("bhanu");
        ar1.add("atirupavel");
        ar.set(2,"Gaurav");

        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ar.addAll(ar1);
        for(String obj:ar)
            System.out.println(obj);
        ar.remove(0);
        ar.remove("atirupavel");
        ar.removeAll(ar1);
        Iterator itr1=ar.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        System.out.println("Is ArrayList Empty: "+ar.isEmpty());
    }
}
