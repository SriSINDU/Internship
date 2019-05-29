import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        ModScanner ms=new ModScanner();
        int n=ms.nextInt();
        int k=ms.nextInt();
        String s=ms.nextToken();
        int cnt=0,ans=0,currcnt=1;
        char curr=s.charAt(0),curr1;
        if(curr=='0')
            curr1='1';
        else
            curr1='0';
        char[] ideal=s.toCharArray();
        if(k==1){
            char[] i1=new char[n+1];
            char[] i2=new char[n+1];
            int m1=0,m2=0;
            for(int i=0;i<n;i+=2){
                i1[i]='0';
                i2[i]='1';
            }
            for(int i=1;i<n;i+=2){
                i1[i]='1';
                i2[i]='0';
            }
            for(int i=0;i<n;i++){
                if(s.charAt(i)!=i1[i])
                    m1++;
                if(s.charAt(i)!=i2[i])
                    m2++;
            }
            if(m1<m2){
                System.out.println(m1);
                for(int i=0;i<n;i++)
                    System.out.print(i1[i]);
                System.out.println();
            }
            else{
                System.out.println(m2);
                for(int i=0;i<n;i++)
                    System.out.print(i2[i]);
                System.out.println();
            }
        }
        else{
            currcnt=1;
            ans=0;
            for(int i=1;i<n;i++){
                if(s.charAt(i)==curr){
                    currcnt++;
                    if(currcnt==2*k+1){
                        ideal[i-k]=(char)(('1'-curr)+'0');
                        ans++;
                        currcnt=k;
                    }

                }
                else{
                    if(currcnt>k){
                        ideal[i-k]=(char)(('1'-curr)+'0');
                        ans++;
                        currcnt=1;
                        curr=s.charAt(i);
                    }
                    else
                    {
                        currcnt=1;
                        curr=s.charAt(i);
                    }
                }
            }
            if(currcnt>k){
                ideal[n-k]=(char)(('1'-curr)+'0');
                ans++;
            }
            System.out.println(ans);
            for(int i=0;i<n;i++)
                System.out.print(ideal[i]);
            System.out.println();
        }

    }
}

class ModScanner {
    BufferedReader br;
    StringTokenizer st;

    public ModScanner() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String nextToken() throws Exception {
        while (st == null || !st.hasMoreElements()) {
            st = new StringTokenizer(br.readLine());

        }
        return st.nextToken();
    }

    int nextInt() throws Exception {
        return Integer.parseInt(nextToken());
    }

    long nextLong() throws Exception {
        return Long.parseLong(nextToken());
    }

    double nextDouble() throws Exception {
        return Double.parseDouble(nextToken());
    }
}
