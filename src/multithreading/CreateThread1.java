package multithreading;

public class CreateThread1 extends Thread {
    public void run(){
        System.out.println("The thread is running.");
    }
    public static void main(String[] args){
        CreateThread1 ct=new CreateThread1();
        ct.start();
    }
}
