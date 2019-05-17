package Strings;

public class StringBufferExample {
    public static void main(String args[]){
        StringBuffer sb=new StringBuffer("Hello ");
        sb.append(" Sindhu");//now original string is changed
        System.out.println(sb);//prints Hello Sindhu
        sb.reverse();
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        StringBuffer sb1=new StringBuffer("Hello ");
        sb1.insert(1,"Sindhu");//now original string is changed
        System.out.println(sb1);
        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());
    }
}

