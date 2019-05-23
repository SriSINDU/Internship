import java.util.*;
public class Loops {
    public static  void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=s.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(a+" x "+i+" = "+(a*i));
        }
    }
}
