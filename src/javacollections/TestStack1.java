package javacollections;
import java.util.*;

public class TestStack1 {
    public static void main(String[] args){
        Stack<String> s=new Stack<String>();
        s.push("sri");
        s.push("sree");
        s.push("shri");
        s.push("reddy");
        s.pop();
        Iterator<String> itr=s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
