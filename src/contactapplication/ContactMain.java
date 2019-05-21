package contactapplication;
import java.util.*;
import java.lang.*;

import static javafx.application.Platform.exit;

public class ContactMain {

    public static void main(String[] args){
        int ch,subch;
        //StringBuffer sb=new StringBuffer(50);
        String num,addr,name,email;
        Scanner s= new Scanner(System.in);
        do{
            System.out.println(" Enter any one of the options\n1.Create new Contact\n2.Update Contact\n3.Delete Contact\n4.Search Contact\n5.Exit");
            ch=s.nextInt();
            switch (ch){
                case 1:System.out.println("Enter the contact details: \nEnter the name  ");
                        name=s.nextLine();
                        System.out.println("Enter the phone number ");
                        num=s.nextLine();
                        System.out.println("Enter the email");
                        email=s.nextLine();
                        System.out.println("Enter the address");
                        addr=s.nextLine();
                         break;

                case 2:System.out.println("on what basis you want to update enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        break;
                case 3:System.out.println("on what basis you want to delete enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        break;
                case 4:System.out.println("on what basis you want to search enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        break;
                case 5:
            }
        }while(ch !=5);
    }
}
