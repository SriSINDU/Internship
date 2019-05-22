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
        Map<String, List<String>> multimap1 = new HashMap<String, List<String>>();
        Map<String, List<String>> multimap2 = new HashMap<String, List<String>>();

        Scanner s= new Scanner(System.in);
        do{
            System.out.println(" Enter any one of the options\n1.Create new Contact\n2.Update Contact\n3.Delete Contact\n4.Search Contact\n5.Display Contacts\n6.Exit");
            ch=s.nextInt();
            switch (ch){
                case 1:ArrayList<String> ar=new ArrayList<String>();
                        ArrayList<String> ar1=new ArrayList<String>();
                        ArrayList<String> ar2=new ArrayList<String>();
                        System.out.println("Enter the contact details: \nEnter the name  ");
                        s.nextLine();
                        name=s.next();
                        if(multimap.containsKey(name)){
                            System.out.println("the name already exists!!! please enter another name");
                            name=s.next();
                        }else {
                            ar1.add(name);
                            ar2.add(name);
                        }
                            System.out.println("Enter the phone number ");
                            s.nextLine();
                            num = s.nextLine();
                            if(multimap2.containsKey(num)){
                                System.out.println("the number already exists!!! please enter another number");
                                num=s.nextLine();
                            }
                            else {
                                ar.add(num);
                                ar1.add(num);
                            }
                            System.out.println("Enter the email");
                            email = s.nextLine();
                            if(multimap1.containsKey(email)){
                                System.out.println("the email already exists!!! please enter another email");
                                email=s.nextLine();
                            }
                            else{
                                ar.add(email);
                                ar2.add(num);
                            }

                            System.out.println("Enter the address");
                            addr = s.nextLine();
                            ar.add(addr);
                            ar1.add(addr);
                            ar2.add(addr);
                            multimap.put(name, ar);
                            multimap1.put(email, ar1);
                            multimap2.put(num, ar2);

                         break;

                case 2:System.out.println("on what basis you want to update enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                        if(subch==1){
                            System.out.println("enter the name");
                            s.nextLine();
                            name=s.next();
                            if(multimap.containsKey(name)){
                                ArrayList<String> arr=new ArrayList<String>();
                                System.out.println("enter the new phone number");
                                num=s.nextLine();
                                System.out.println("enter the new email");
                                email=s.nextLine();
                                System.out.println("enter the new address");
                                addr=s.nextLine();
                                arr.add(num);
                                arr.add(email);
                                arr.add(addr);
                                multimap.replace(name,arr);

                            }else{
                                System.out.println("The contact doesn't exist!!!");
                            }
                        }else if(subch==2){
                            System.out.println("enter the email");
                            s.nextLine();
                            email=s.next();
                            if(multimap1.containsKey(email)){
                                ArrayList<String> arr1=new ArrayList<String>();
                                System.out.println("enter the new name");
                                name=s.nextLine();
                                System.out.println("enter the new phone number");
                                num=s.nextLine();
                                System.out.println("enter the new address");
                                addr=s.nextLine();
                                arr1.add(name);
                                arr1.add(num);
                                arr1.add(addr);
                                multimap1.replace(email,arr1);

                            }else{
                                System.out.println("The contact doesn't exist!!!");
                            }
                        }else if(subch==3){
                            System.out.println("enter the mobile number");
                            s.nextLine();
                            num=s.next();
                            if(multimap2.containsKey(num)){
                                ArrayList<String> arr2=new ArrayList<String>();
                                System.out.println("enter the new name ");
                                name=s.nextLine();
                                System.out.println("enter the new email ");
                                email=s.nextLine();
                                System.out.println("enter the new address");
                                addr=s.nextLine();
                                arr2.add(name);
                                arr2.add(email);
                                arr2.add(addr);
                                multimap2.replace(num,arr2);
                            }else{
                                System.out.println("The contact doesn't exist!!!");
                            }
                        }
                        break;
                case 3:System.out.println("on what basis you want to delete enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                    if(subch==1){
                        System.out.println("enter the name");
                        s.nextLine();
                        name=s.next();
                        if(multimap.containsKey(name)){
                            multimap.remove(name);
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==2){
                        System.out.println("enter the email");
                        s.nextLine();
                        email=s.next();
                        if(multimap1.containsKey(email)){
                            multimap1.remove(email);
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==3){
                        System.out.println("enter the mobile number");
                        s.nextLine();
                        num=s.next();
                        if(multimap2.containsKey(num)){
                            multimap2.remove(num);
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }
                        break;
                case 4:System.out.println("on what basis you want to search enter that option!!\n 1.name 2.email 3.phone");
                        subch=s.nextInt();
                    if(subch==1){
                        System.out.println("enter the name");
                        s.nextLine();
                        name=s.next();
                        if(multimap.containsKey(name)){
                            System.out.println(name+multimap.get(name));
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==2){
                        System.out.println("enter the email");
                        s.nextLine();
                        email=s.next();
                        if(multimap1.containsKey(email)){
                            System.out.println(email+multimap1.get(email));
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==3){
                        System.out.println("enter the mobile number");
                        s.nextLine();
                        num=s.next();
                        if(multimap2.containsKey(num)){
                            System.out.println(num+multimap.get(num));
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }
                        break;
                case 5: System.out.println(multimap);
                case 6:
            }
        }while(ch !=6);
    }
}
