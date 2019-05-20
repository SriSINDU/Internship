package javacollections;
import java.util.*;
public class TestLinkedList1 {
    public static void main(String[] args){
        LinkedList<String> ar=new LinkedList<String>();
        ar.add("Sindhu");
        ar.add("Varsha");
        ar.add("bhanu");
        ar.add("bhanu");
        ar.add("atrhirupavel");
        ar.add("vijay");
        ar.add("varsha");
        Iterator itr=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        ar.removeFirst();
        ar.removeFirstOccurrence("varsha");
        Iterator itr1=ar.iterator();
        while(itr.hasNext()){
            System.out.println(itr1.next());
        }
        ar.removeLast();
        ar.removeLastOccurrence("bhanu");
        for(String obj:ar)
            System.out.println(obj);
    }
}
