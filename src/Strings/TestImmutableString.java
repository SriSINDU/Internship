package Strings;

public class TestImmutableString {
    public static void main(String args[]){
        String s="Sri";
        s.concat(" Sindhu");
        String s1="Sri";
        s1=s1.concat(" Sindhu");
        System.out.println(s);
        System.out.println(s1);
    }
}
