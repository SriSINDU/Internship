package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args){
        try{
            String s=null;
            System.out.println(s.length());
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Exception Caught "+e);
        }
        catch(NullPointerException e){
            System.out.println("Exception caught "+e);
        }
    }
}
