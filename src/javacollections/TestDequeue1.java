package javacollections;
import java.util.*;
public class TestDequeue1 {
    public static void main(String[] args){
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
