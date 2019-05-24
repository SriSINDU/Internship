import java.util.*;
import java.lang.Math.*;
public class LoopsOne {
    public static void main(String[] args){
        int t,n,a,b,c,i;
        double j,k,l,s1;
        k=2;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(i=0;i<t;i++){
            n=s.nextInt();
            a=s.nextInt();
            b=s.nextInt();
            for(j=0;j<n;j++){
                l=Math.pow(k,j);//(a + 2^0 * b),
                s1=a+(l*b);
                System.out.print(s1+" ");
            }
            System.out.println("");
        }
    }
}
//2 6 14 30 62 126 254 510 1022 2046
//        8 14 26 50 98