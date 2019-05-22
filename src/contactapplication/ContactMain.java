package contactapplication;
import java.util.*;
import java.lang.*;

import static javafx.application.Platform.exit;
import java.util.*;
public class ContactMain {

    public static void main(String[] args){
        int ch,subch;
        //StringBuffer sb=new StringBuffer(50);
        String num,addr,name,email;
        Map<String, List<String>> multimap = new HashMap<String, List<String>>();
        ArrayList<String> ar=new ArrayList<String>();
        Scanner s= new Scanner(System.in);
        do{
            System.out.println(" Enter any one of the options\n1.Create new Contact\n2.Update Contact\n3.Delete Contact\n4.Search Contact\n5.Exit");
            ch=s.nextInt();
            switch (ch){
                case 1:System.out.println("Enter the contact details: \nEnter the name  ");
                        s.next();
                        name=s.nextLine();
                        System.out.println("Enter the phone number ");
                        num=s.nextLine();
                        ar.add(num);
                        System.out.println("Enter the email");
                        email=s.nextLine();
                        ar.add(email);
                        System.out.println("Enter the address");
                        addr=s.nextLine();
                        ar.add(addr);
                        multimap.put(name,ar);
                         break;

                case 2:System.out.println("on what basis you want to update enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        break;
                case 3:System.out.println("on what basis you want to delete enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        break;
                case 4:System.out.println("on what basis you want to search enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        System.out.println(multimap);
                        break;
                case 5:
            }
        }while(ch !=5);
    }
}
