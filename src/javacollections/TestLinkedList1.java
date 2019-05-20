package javacollections;
import java.util.*;
public class TestLinkedList1 {
    public static void main(String[] args){
        LinkedList<String> ar=new LinkedList<String>();
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
