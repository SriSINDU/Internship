import java.util.*;
public class HotelBooking {
    public static void main(String[] args){
        int rating,days;
        double money,amt,amt1;
        Scanner s=new Scanner(System.in);
        System.out.println("Mr.Rohit please Enter the money you can spend");
        money=s.nextDouble();
        System.out.println("How many days you want to spend?");
        days=s.nextInt();
        System.out.println("what is your preferred star rating?(5 or 3 or 1)");
        rating=s.nextInt();
        switch(rating){
            case 1:  if(days<3){
                        amt=days*41.55;
                        amt1=days*43;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Accord for the cost of "+amt);
                        }
                        else if(amt1<amt && amt1<money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Fortune for the cost of "+amt1);
                        }
                        else{
                            System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                        }
                    }

                     break;
            case 3:  break;
            case 5:  break;
        }
    }
}
