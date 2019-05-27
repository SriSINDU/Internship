import java.util.*;
public class CalculateTotalCost {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        float mealcost,totalcost;
        int tax,tip;
        mealcost=s.nextFloat();
        tip=s.nextInt();
        tax=s.nextInt();
        totalcost=mealcost+((mealcost*tip)/100)+((mealcost*tax)/100);
        System.out.println((int)totalcost);
    }
}
