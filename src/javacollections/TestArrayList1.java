package javacollections;
import java.util.*;

public class TestArrayList1 {
    public static void main(String[] args){
        ArrayList<String> ar=new ArrayList<String>();
        ar.add("Sindhu");
        ar.add("Varsha");
        ar.add("bhanu");
        ar.add("atrhirupavel");
        ar.add("vijay");
        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
