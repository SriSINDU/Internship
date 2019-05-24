package contactapplication;
import java.util.*;
import java.lang.*;

public class Contacts {

    public static void main(String[] args){
        int id,id1,ch,subch;
        id=1;
        String num,addr,name,email,name1,num1,email1,addr1;
        Map<Integer, List<String>> map1 = new HashMap<Integer, List<String>>();
        Map<String, Integer> map2=new HashMap<String,Integer>();
        Scanner s=new Scanner(System.in);
        do{
            System.out.println(" Enter any one of the options\n1.Create new Contact\n2.Update Contact\n3.Delete Contact\n4.Search Contact\n5.Exit");
            ch=s.nextInt();
            s.nextLine();
            switch(ch){
                case 1:ArrayList<String> ar=new ArrayList<String>();
                       System.out.println("Enter the contact details: \nEnter the name  ");
                       name=s.next();
                       if(map2.containsKey(name)){
                           System.out.println("the name already exists!!! please enter again");
                           break;
                       }
                       else{
                           ar.add(name);
                       }
                        System.out.println("Enter the phone number ");
                        num = s.next();
                        if(map2.containsKey(num)){
                         System.out.println("the number already exists!!! please enter again");
                         break;
                        }
                        else{
                         ar.add(num);
                        }
                        System.out.println("Enter the email");
                        email = s.next();
                        if(map1.containsKey(email)){
                             System.out.println("the email already exists!!! please enter again");
                             break;
                        }
                         else{
                        ar.add(email);
                        }
                         System.out.println("enter the address ");
                         addr=s.next();
                         ar.add(addr);
                         map1.put(id,ar);
                         map2.put(name,id);
                         map2.put(num,id);
                         map2.put(email,id);
                         id++;
                         break;
                case 2: System.out.println("on what basis you want to update enter that option!!\n 1.name 2.phone 3.email");
                        subch=s.nextInt();
                        s.nextLine();
                        if(subch==1){
                            System.out.println("enter the name");
                            name=s.next();
                            id1=map2.get(name);
                            if(map2.containsKey(name)){
                                System.out.println("what do you want to update? name or email or phone or address");
                                String update=s.next();
                                if(update.equals("name")){
                                    System.out.println("please enter the new name");
                                    name1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(name);
                                    l.set(0,name1);
                                    map2.remove(name);
                                    map2.put(name1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("phone")){
                                    System.out.println("please enter the new number");
                                    num1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    num=l.get(1);
                                    l.remove(num);
                                    l.set(1,num1);
                                    map2.remove(num);
                                    map2.put(num1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("email")){
                                    System.out.println("please enter the new email");
                                    email1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    email=l.get(2);
                                    l.remove(email);
                                    l.set(2,email1);
                                    map2.remove(email);
                                    map2.put(email1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("address")){
                                    System.out.println("please enter the new address");
                                    addr1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(addr1);
                                    l.set(3,addr1);
                                    map1.replace(id1,l);
                                }

                            }else{
                                System.out.println("The name doesnot exist!!! please try again");
                                break;
                            }
                        }
                        if(subch==2){
                            System.out.println("enter the number");
                            num=s.next();
                            id1=map2.get(num);
                            if(map2.containsKey(num)){
                                System.out.println("what do you want to update? name or email or phone or address");
                                String update=s.next();
                                if(update.equals("name")){
                                    System.out.println("please enter the new name");
                                    name1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    name=l.get(0);
                                    l.remove(name);
                                    l.set(0,name1);
                                    map2.remove(name);
                                    map2.put(name1,id1);
                                    map1.replace(id1,l);
                                }

                                if(update.equals("phone")){
                                    System.out.println("please enter the new number");
                                    num1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(num);
                                    l.set(1,num1);
                                    map2.remove(num);
                                    map2.put(num1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("email")){
                                    System.out.println("please enter the new email");
                                    email1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    email=l.get(2);
                                    l.remove(email);
                                    l.set(2,email1);
                                    map2.remove(email);
                                    map2.put(email1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("address")){
                                    System.out.println("please enter the new address");
                                    addr1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(3);
                                    l.set(3,addr1);
                                    map1.replace(id1,l);
                                }

                            }else{
                                System.out.println("The number doesnot exist!!! please try again");
                                break;
                            }

                        }
                        if(subch==3){
                            System.out.println("enter the email");
                            email=s.next();
                            id1=map2.get(email);
                            if(map2.containsKey(email)){
                                System.out.println("what do you want to update? name or email or phone or address");
                                String update=s.next();
                                if(update.equals("name")){
                                    System.out.println("please enter the new name");
                                    name1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    name=l.get(0);
                                    l.remove(name);
                                    l.set(0,name1);
                                    map2.remove(name);
                                    map2.put(name1,id1);
                                    map1.replace(id1,l);
                                }

                                if(update.equals("phone")){
                                    System.out.println("please enter the new number");
                                    num1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    num=l.get(1);
                                    l.remove(num);
                                    l.set(1,num1);
                                    map2.remove(num);
                                    map2.put(num1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("email")){
                                    System.out.println("please enter the new email");
                                    email1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(email);
                                    l.set(2,email1);
                                    map2.remove(email);
                                    map2.put(email1,id1);
                                    map1.replace(id1,l);
                                }
                                if(update.equals("address")){
                                    System.out.println("please enter the new address");
                                    addr1=s.next();
                                    List<String> l=new ArrayList<>();
                                    l=map1.get(id1);
                                    l.remove(3);
                                    l.set(3,addr1);
                                    map1.replace(id1,l);
                                }

                            }else{
                                System.out.println("The email doesnot exist!!! please try again");
                                break;
                            }
                        }
                        break;
                case 3: System.out.println("on what basis you want to delete 1.name 2.number 3.email");
                        subch=s.nextInt();
                        s.nextLine();
                        if(subch==1){
                             System.out.println("enter the name");
                             name=s.next();
                             if(map2.containsKey(name)){
                                 id1=map2.get(name);
                                 List<String> l1=new ArrayList<>();
                                // email=map1.get(id1.get(2));
                                 l1=map1.get(id1);
                                 email=l1.get(2);
                                 num=l1.get(1);
                                 map2.remove(name);
                                 map2.remove(num);
                                 map2.remove(email);
                                 map1.remove(id1);
                             }
                             else{
                                 System.out.println("The name doesnot exist!!! please try again");
                                 break;
                             }
                        }
                        if(subch==2){
                            System.out.println("enter the number");
                            num=s.next();
                            if(map2.containsKey(num)){
                                id1=map2.get(num);
                                List<String> l1=new ArrayList<>();
                                // email=map1.get(id1.get(2));
                                l1=map1.get(id1);
                                name=l1.get(0);
                                email=l1.get(2);
                                map2.remove(name);
                                map2.remove(num);
                                map2.remove(email);
                                map1.remove(id1);
                            }
                            else{
                                System.out.println("The number doesnot exist!!! please try again");
                                break;
                            }
                        }
                        if(subch==3){
                            System.out.println("enter the email");
                            email=s.next();
                            if(map2.containsKey(email)){
                                id1=map2.get(email);
                                List<String> l1=new ArrayList<>();
                                // email=map1.get(id1.get(2));
                                l1=map1.get(id1);
                                name=l1.get(0);
                                num=l1.get(1);
                                map2.remove(name);
                                map2.remove(num);
                                map2.remove(email);
                                map1.remove(id1);
                            }
                            else{
                                System.out.println("The email doesnot exist!!! please try again");
                                break;
                            }
                        }
                        break;
                case 4: System.out.println("On what basis you want  to search\n 1.name 2.number 2.email");
                        subch=s.nextInt();
                        s.nextLine();
                        if(subch==1){
                            System.out.println("enter the name ");
                            name=s.next();
                            if(map2.containsKey(name)){
                                id1=map2.get(name);
                                System.out.println(map1.get(id1));
                            }
                            else{
                                System.out.println("No contact exists for the name you entered!!!");
                                break;
                            }
                        }
                        if(subch ==2){
                            System.out.println("enter the number ");
                            num=s.next();
                            if(map2.containsKey(num)){
                                id1=map2.get(num);
                                System.out.println(map1.get(id1));
                            }
                            else{
                                System.out.println("No contact exists for the number you entered!!!");
                                break;
                            }
                        }
                        if(subch==3){
                            System.out.println("enter the email ");
                            email=s.next();
                            if(map2.containsKey(email)){
                                id1=map2.get(email);
                                System.out.println(map1.get(id1));
                            }
                            else{
                                System.out.println("No contact exists for the email you entered!!!");
                                break;
                            }
                        }
                        break;
                case 5:
            }
        }while(ch!=5);
    }
}
