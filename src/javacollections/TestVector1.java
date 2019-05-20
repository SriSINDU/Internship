package javacollections;
import java.util.*;

public class TestVector1 {
    public static void main(String[] args){
        Vector<String> v=new Vector<String>();
        v.add("sindhu");
        v.add("siddhi");
        Iterator itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
