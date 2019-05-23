import java.util.*;
public class JavaDataTypes {
    public static void main(String args[]){
        int t,len;
        String n;
        Scanner s=new Scanner(System.in);
        t=s.nextInt();
        for(int i=0;i<t;i++){
            n=s.next();
            len=n.length();
            if(len>20){
                System.out.println(n+" can't be fitted anywhere.");
            }
            else {
                System.out.println(n+" can be fitted in: ");
                if(len<=4){
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if(len<=7){
                    System.out.println("* short\n* int \n* long");
                }
                else if(len<=11){
                    System.out.println("* int\n* long");
                }
                else if(len<=20){
                    System.out.println("* long");
                }
            }

        }
    }
}
/*
byte 1 byte -128 to 127.
short 2 bytes -32,768 to 32,767.
int 4 bytes -2,147,483,648 to 2,147,483,647.
long 8 bytes -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. */