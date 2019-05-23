package tryjavadate;
import java.util.*;
import java.text.SimpleDateFormat;
public class CreateEventForDate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int ch1;
        String d2,s1,event;
        s1="";
        /* Date d = new Date();
           SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
           String d1 = f.format(d);
           System.out.println(d1); */
        Map<String, String> mp = new HashMap<String, String>();
        do{
            System.out.println("Enter any one of the option \n1.create event\n2.retrieve event\n3.exit");
            ch1=s.nextInt();
            switch(ch1){
                case 1: System.out.println("enter the date you want to add the event in the format of dd/MM/yyyy");
                        s.nextLine();
                        d2=s.next();
                        System.out.println("Enter the event name and time(format hh:mm:ss)");
                        s.nextLine();
                        event=s.nextLine();
                        s1=s1.concat(event);
                        if(mp.containsKey(d2)){
                            mp.replace(d2,s1);
                        }
                        else{
                            mp.put(d2,event);
                        }
                        break;
                case 2:System.out.println("enter the date(format dd/MM/yyyy) for which you want to retrieve the events");
                        s.nextLine();
                        d2=s.next();
                        if(mp.containsKey(d2)){
                            System.out.println(mp.get(d2));
                        }else{
                            System.out.println("sorry!! you don't have any events for the day");
                        }
                        break;
                case 3:
            }
        }while(ch1 != 3);

    }
}
