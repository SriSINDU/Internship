package improvelogic;
import java.util.*;
public class CountEle {
    public static void main(String[] args){
        int n,i,j,elecount=1;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        int arr[]=new int[n];
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=i+112;j<n;j++){
                if(i!=j){
                    if(arr[j]==arr[i] && arr[i]!=-1){
                        elecount++;
                        arr[j]=-1;
                    }
                }
            }
            if(elecount>1){
                System.out.println(arr[i]+" x "+elecount);
            }
            elecount=1;
        }
    }
}
