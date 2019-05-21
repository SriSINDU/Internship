package multithreading;

class First1
{
    public void display(String msg)
    {
        System.out.print ("["+msg);
        try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println ("]");
    }
}
class Second1 extends Thread
{
    String msg;
    First1 fobj;
    Second1 (First1 fp,String str)
    {
        fobj = fp;
        msg = str;
        start();
    }
    public void run()
    {
        synchronized(fobj)       //Synchronized block
        {
            fobj.display(msg);
        }
    }
}
public class Syncro1 {
    public static void main (String[] args)
    {
        First1 fnew = new First1();
        Second1 ss = new Second1(fnew, "welcome");
        Second1 ss1= new Second1 (fnew,"new");
        Second1 ss2 = new Second1(fnew, "programmer");
    }
}
