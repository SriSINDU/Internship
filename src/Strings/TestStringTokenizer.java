package Strings;
import java.util.StringTokenizer;

public class TestStringTokenizer {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is Sindhu"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        StringTokenizer st1 = new StringTokenizer("my,name,is,Sindhu",",");
        while (st1.hasMoreTokens()) {
            System.out.println(st1.nextToken());
        }
    }
}
