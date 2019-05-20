package javacollections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestPriorityQueue1 {
    public static void main(String[] args){
        PriorityQueue pq =new PriorityQueue<String>();
        pq.add("sri");
        pq.add("sindhu");
        pq.add("aman");
        pq.add("mohan");
        System.out.println("head element: "+pq.element());
        pq.remove();
       Iterator itr=pq.iterator();
       while(itr.hasNext()){
           System.out.println(itr.next());
        }
    }
}
