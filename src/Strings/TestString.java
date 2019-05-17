package Strings;

public class TestString {
    public static void main(String[] args){
        String s1=new String("Sindhu");
        String s2=new String("Sindhu");
        if(s1==s2){
            System.out.println("Strings are allocated same memory!");
        }
        else{
            System.out.println("Strings are allaocated different memory");
        }
    }
}
