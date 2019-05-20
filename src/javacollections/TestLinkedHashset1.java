package javacollections;
import java.util.*;
public class TestLinkedHashset1 {
    public static void main(String[] args){
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("yamini");
        set.add("");
        set.add("chandini");
        set.add("yamini");
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
