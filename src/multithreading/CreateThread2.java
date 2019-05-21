package multithreading;

public class CreateThread2 implements Runnable {
    public void run(){
        System.out.println("The Thread is running.");
    }
    public static void main(String[] args){
        CreateThread2 ct=new CreateThread2();
        Thread t=new Thread(ct);
        t.start();

    }
}
