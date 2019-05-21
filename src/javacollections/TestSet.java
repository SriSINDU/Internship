package javacollections;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

    public static void main(String arg[]){
        Set<String> sets = new HashSet<>();
        sets.add("Aman");
        sets.add("sindhu");

        for(String str : sets){
            sets.add("mohan");
        }

    }
}
