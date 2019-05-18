package ExceptionHandling;

public class MyOwnException extends Exception {
    private int ex;

    MyOwnException(int a) {
        ex = a;
    }

    public String toString() {
        return "MyException[" + ex + "] is less than zero";
    }

    static void sum(int a, int b) throws MyOwnException {
        if (a < 0) {
            throw new MyOwnException(a); //calling constructor of user-defined exception class
        } else {
            System.out.println(a + b);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            sum(-10, 10);
        }
        catch(MyOwnException me)
        {
            System.out.println(me); //it calls the toString() method of user-defined Exception
        }
    }
}
