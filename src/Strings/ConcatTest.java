package Strings;

public class ConcatTest {
    public static String concatWithString()    {
        String t = "hi";
        for (int i=0; i<10000; i++){
            t = t + "Sindhu";
        }
        return t;
    }
    public static String concatWithStringBuffer(){
        StringBuffer sb = new StringBuffer("Hello");
        for (int i=0; i<10000; i++){
            sb.append("Sri");
        }
        return sb.toString();
    }
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        concatWithString();
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");
    }
}
