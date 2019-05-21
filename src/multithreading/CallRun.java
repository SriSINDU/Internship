package multithreading;

public class CallRun extends  Thread {
    public void run(){
        System.out.println("In the run()");
    }
    public static void main(String[] args){
        CallRun cr=new CallRun();
        cr.run();
    }
}
