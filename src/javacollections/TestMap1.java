package javacollections;
import java.util.*;

public class TestMap1 {
    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<Integer,String>();
        map.put(1,"Aman");
        map.put(2,"Mohan");
        map.put(3,"Sindhu");
        //Elements can traverse in any order
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
