package javacollections;
import java.util.*;
public class TestHashMap {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<Integer,String>();

        hm.put(1,"sindhu");
        hm.put(2,"yamini");
        hm.put(3,"Siddhi");
        hm.putIfAbsent(1, "Gaurav");
        hm.putIfAbsent(4,"varsha");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        hm.remove(1);
        hm.replace(2, "chandini");
        hm.remove(2,"chandini");
        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
