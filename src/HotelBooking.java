import java.util.*;
public class HotelBooking {
    public static void main(String[] args){
        int rating,days;
        double money,amt,amt1,dis;
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

                    if(days<=4){
                        dis=(11.8*41.55*days)/100;
                        amt=(days*41.55)-dis;
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
                    if(days>4){
                        dis=(14.8*43*days)/100;
                        amt=(days*41.55);
                        amt1=days*43-dis;
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
            case 3:  if(days<2){
                        amt=days*60;
                        amt1=days*58;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Raddison for the cost of "+amt);
                        }
                        else if(amt1<amt && amt1<money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Rain Tree for the cost of "+amt1);
                        }
                        else{
                            System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                        }
                    }
                    if(days<=3){
                        dis=(18*60*days)/100;
                        amt=(days*60)-dis;
                        amt1=days*58;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Raddison for the cost of "+amt);
                        }
                         else if(amt1<amt && amt1<money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Rain Tree for the cost of "+amt1);
                        }
                        else{
                        System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                         }

                    }
                    if(days>3){
                        dis=(15*58*days)/100;
                        amt=(days*60);
                        amt1=days*58-dis;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Raddison for the cost of "+amt);
                        }
                        else if(amt1<amt && amt1<money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" RainTree for the cost of "+amt1);
                        }
                        else{
                            System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                        }
                    }
                     break;
            case 5:  if(days<2){
                    amt=days*90;
                    amt1=days*82;
                    if(amt<amt1 && amt<=money){
                        System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" The park for the cost of "+amt);
                    }
                    else if(amt1<amt && amt1<money){
                        System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Hyat for the cost of "+amt1);
                    }
                    else{
                        System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                     }
                    }
                    if(days<=3){
                        dis=(20*90*days)/100;
                        amt=(days*90)-dis;
                        amt1=days*82;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" The Park for the cost of "+amt);
                        }
                        else if(amt1<amt && amt1<money){
                        System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Hyat for the cost of "+amt1);
                         }
                        else{
                        System.out.println("Sorry! you dont have sufficient amount to book any hotel");
                        }

                    }
                    else {
                        dis=(12*82*days)/100;
                        amt=(days*90);
                        amt1=days*82-dis;
                        if(amt<amt1 && amt<=money){
                            System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" The Park for the cost of "+amt);
                        }
                        else if(amt1<amt && amt1<money){
                             System.out.println("Hotel booked for "+days+" days in "+rating+" star Hotel"+" Hyat for the cost of "+amt1);
                        }
                        else{
                            System.out.println("Sorry! you don't have sufficient amount to book any hotel");
                        }
                     }
                    break;
        }
    }
}
