package ExceptionHandling;

public class MultiCatchEg {
    public static void main(String[] args)
    {
        try
        {
            int arr[]={1,2};
            arr[2]=3/0;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index out of bound exception");
        }
    }
}
