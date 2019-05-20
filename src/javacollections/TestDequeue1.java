package javacollections;
import java.util.*;
public class TestDequeue1 {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        deque.offer("arvind");
        deque.offer("vimal");
        deque.add("mukul");
        deque.offerFirst("jai");
        for (String str : deque) {
            System.out.println(str);
        }
        deque.pollLast();
        System.out.println("After pollLast() Traversal...");
        for(String s:deque){
            System.out.println(s);
        }
    }

}
