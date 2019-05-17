package Strings;

public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append(" Sindhu");//now original string is changed
        System.out.println(sb);//prints Hello Sindhu
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Hello ");
        sb1.insert(1,"Sindhu");//now original string is changed
        System.out.println(sb1);
    }
}

