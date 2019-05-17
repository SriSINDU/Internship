package ExceptionHandling;

public class ExceptionExample {
    public static void main(String args[]){
        try{
            //code that may raise exception
            int data=100/0;
        }catch(ArithmeticException e){System.out.println(e);}
        //rest code of the program
        System.out.println("You cannot divide any number by Zero. Please make a note.");
    }
}
