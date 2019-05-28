package improvelogic;
import java.util.*;
public class CountOddPairs {
    public static  void main(String[] args){
        int i,j,toc,countele,n;
        toc=0;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++){
            countele=1;
            for(j=1+i;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j] && arr[i]!=-1){
                        countele++;
                        arr[j]=-1;
                    }
                }
            }

            if(countele%2 != 0 && arr[i]!=-1){
                toc++;
            }
        }
        System.out.println(toc);
    }
}
