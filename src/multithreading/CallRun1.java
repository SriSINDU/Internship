package multithreading;

public class CallRun1 extends Thread {
    public void run(){
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        CallRun1 t1=new CallRun1();
        CallRun1 t2=new CallRun1();

        t1.run();
        t2.run();
    }
}
