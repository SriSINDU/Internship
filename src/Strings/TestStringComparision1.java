package Strings;

public class TestStringComparision1 {
    public static void main(String args[]){
        String s1="Sachin";
        String s2="Sachin";
        String s3=new String("Sachin");
        String s4="Saurav";
        String s5="Sachin";
        String s6="SACHIN";
        String s7="Ratan";
        System.out.println(s1==s2);//true (because both refer to same instance)
        System.out.println(s1==s3);
        System.out.println(s5.equals(s6));//false
        System.out.println(s5.equalsIgnoreCase(s6));//true
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s7));//1(because s1>s37
        System.out.println(s7.compareTo(s1));

    }
}
