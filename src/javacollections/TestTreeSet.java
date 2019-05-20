package javacollections;
import java.util.*;
public class TestTreeSet {
    public static void main(String[] args){
        TreeSet<Integer> set=new TreeSet<Integer>();
        set.add(24);
        set.add(66);
        set.add(12);
        set.add(15);
        System.out.println("Highest Value: "+set.pollFirst());
        System.out.println("Lowest Value: "+set.pollLast());

        TreeSet<String> s=new TreeSet<String>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");
        s.add("E");
        System.out.println("Initial Set: "+s);

        System.out.println("Reverse Set: "+s.descendingSet());

        System.out.println("Head Set: "+s.headSet("C", true));

        System.out.println("SubSet: "+s.subSet("A", false, "E", true));

        System.out.println("TailSet: "+s.tailSet("C", false));
    }
}
