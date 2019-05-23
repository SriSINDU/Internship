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
            s.nextLine();
            switch (ch){
                case 1:ArrayList<String> ar=new ArrayList<String>();
                        ArrayList<String> ar1=new ArrayList<String>();
                        ArrayList<String> ar2=new ArrayList<String>();
                        System.out.println("Enter the contact details: \nEnter the name  ");
                       // s.nextLine();
                        name=s.next();
                        if(multimap.containsKey(name)){
                            System.out.println("the name already exists!!! please enter again");
                            break;
                        }else {
                            ar1.add(name);
                            ar2.add(name);
                        }
                            System.out.println("Enter the phone number ");
                            num = s.next();
                            if(multimap2.containsKey(num)){
                                System.out.println("the number already exists!!! please enter again");
                                break;
                            }
                            else {
                                ar.add(num);
                                ar1.add(num);
                            }
                            System.out.println("Enter the email");
                            email = s.next();
                            if(multimap1.containsKey(email)){
                                System.out.println("the email already exists!!! please enter again");
                                break;
                            }
                            else{
                                ar.add(email);
                                ar2.add(email);
                            }

                            System.out.println("Enter the address");
                            s.nextLine();
                            addr = s.next();
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
                                ArrayList<String> arr1=new ArrayList<String>();
                                ArrayList<String> arr2=new ArrayList<String>();
                                System.out.println("enter the new phone number");
                                num=s.next();
                                if(multimap2.containsKey(num)){
                                    System.out.println("the number already exists for another contact. please enter again");
                                    break;
                                }
                                System.out.println("enter the new email");
                                email=s.next();
                                if(multimap1.containsKey(email)){
                                    System.out.println("the email already exists for another contact. Please enter again!!");
                                    break;
                                }
                                System.out.println("enter the new address");
                                addr=s.next();
                                arr1.add(name);
                                arr2.add(name);
                                arr.add(num);
                                arr.add(email);
                                arr.add(addr);
                                arr1.add(num);
                                arr1.add(addr);
                                arr2.add(email);
                                arr2.add(addr);
                                multimap.replace(name,arr);
                                multimap1.replace(email,arr1);
                                multimap2.replace(num,arr2);

                            }else{
                                System.out.println("The contact doesn't exist!!!");
                            }
                        }else if(subch==2){
                            System.out.println("enter the email");
                            s.nextLine();
                            email=s.next();
                            if(multimap1.containsKey(email)){
                                ArrayList<String> arr=new ArrayList<String>();
                                ArrayList<String> arr1=new ArrayList<String>();
                                ArrayList<String> arr2=new ArrayList<String>();
                                System.out.println("enter the new name");
                                name=s.next();
                                if(multimap.containsKey(name)){
                                    System.out.println("the name already exists in another contact. please enter again");
                                    break;
                                }
                                System.out.println("enter the new phone number");
                                num=s.next();
                                if(multimap2.containsKey("num")){
                                    System.out.println("The number already exists for another contact. Please enter again");
                                    break;
                                }
                                System.out.println("enter the new address");
                                addr=s.next();
                                arr1.add(name);
                                arr1.add(num);
                                arr1.add(addr);
                                arr.add(num);
                                arr.add(email);
                                arr.add(addr);
                                arr2.add(name);
                                arr2.add(email);
                                arr2.add(addr);
                                multimap.replace(name,arr);
                                multimap1.replace(email,arr1);
                                multimap2.replace(num,arr2);

                            }else{
                                System.out.println("The contact doesn't exist!!!");
                            }
                        }else if(subch==3){
                            System.out.println("enter the mobile number");
                            s.nextLine();
                            num=s.next();
                            if(multimap2.containsKey(num)){
                                ArrayList<String> arr=new ArrayList<String>();
                                ArrayList<String> arr1=new ArrayList<String>();
                                ArrayList<String> arr2=new ArrayList<String>();
                                System.out.println("enter the new name ");
                                name=s.next();
                                if(multimap.containsKey(name)){
                                    System.out.println("the name already exists in another contact. please enter again");
                                    break;
                                }
                                System.out.println("enter the new email ");
                                email=s.next();
                                if(multimap1.containsKey(email)){
                                    System.out.println("the email already exists for another contact. Please enter again!!");
                                    break;
                                }
                                System.out.println("enter the new address");
                                addr=s.next();
                                arr1.add(name);
                                arr1.add(num);
                                arr1.add(addr);
                                arr.add(num);
                                arr.add(email);
                                arr.add(addr);
                                arr2.add(name);
                                arr2.add(email);
                                arr2.add(addr);
                                multimap.replace(name,arr);
                                multimap1.replace(email,arr1);
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
                            List<String> l=new ArrayList<String>();
                            l=multimap.get(name);
                            num=l.get(0);
                            email=l.get(1);
                            multimap.remove(name);
                            multimap1.remove(email);
                            multimap2.remove(num);
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==2){
                        System.out.println("enter the email");
                        s.nextLine();
                        email=s.next();
                        if(multimap1.containsKey(email)){
                            List<String> l=new ArrayList<String>();
                            l=multimap1.get(email);
                            multimap1.remove(email);
                            name=l.get(0);
                            num=l.get(1);
                            multimap.remove(name);
                            multimap2.remove(num);
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }else if(subch==3){
                        System.out.println("enter the mobile number");
                        s.nextLine();
                        num=s.next();
                        if(multimap2.containsKey(num)){
                            List<String> l=new ArrayList<String>();
                            l=multimap2.get(num);
                            name=l.get(0);
                            email=l.get(1);
                            multimap.remove(name);
                            multimap1.remove(email);
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
                            System.out.println(num+multimap2.get(num));
                        }else{
                            System.out.println("The contact doesn't exist!!!");
                        }
                    }
                        break;
                case 5: System.out.println(multimap);
                        System.out.println(multimap1);
                        System.out.println(multimap2);
                case 6:
            }
        }while(ch !=6);
    }
}
