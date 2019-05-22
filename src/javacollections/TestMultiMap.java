package javacollections;

import java.util.*;

public class TestMultiMap {
    public static void main(String[] args){
      /*  Multimap<String, String> multimap1 = new ArrayListMultimap<String, String>();
        String key = "asdf";
        multimap1.put(key, "foo");
        multimap1.put(key, "bar"); */
        Map<String, List<String>> multimap = new HashMap<String, List<String>>();
        String key = "asdf";
        ArrayList<String> ar =new ArrayList<String>();
        ar.add("foo");
        ar.add("bar");
        //List<String> values = Arrays.asList("foo", "bar");

       // multimap.put(key, values);
        multimap.put(key,ar);
        System.out.println(multimap);
    }
}
