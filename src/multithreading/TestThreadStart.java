package multithreading;

public class TestThreadStart extends Thread {
    public void run(){
        System.out.println("running...");
    }
    public static void main(String args[]){
        try {
            TestThreadStart t1 = new TestThreadStart();
            t1.start();
            t1.start();
        }
        catch (IllegalThreadStateException e){
            System.out.println("Exception caught"+e);
        }
    }
}
