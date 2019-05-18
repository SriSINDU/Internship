package ExceptionHandling;

public class FinallyEg {
    public static void main(String[] args)
    {
        int a[]= new int[2];
        System.out.println("out of try");
        try
        {
            System.out.println("Access invalid element"+ a[3]);
            /* the above statement will throw ArrayIndexOutOfBoundException */
        }
        catch(Exception e){
            System.out.println("Exception caught "+e);
    }
        finally
        {
            System.out.println("finally is always executed.");
        }
    }
}
