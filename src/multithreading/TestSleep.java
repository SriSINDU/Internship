package multithreading;

public class TestSleep extends Thread {
    public void run(){
        for(int i=0;i<3;i++){
            try{
                Thread.sleep(0);
            }
            catch(Exception e){
                System.out.println("Exception caught "+e);
            }
            System.out.println(i);
            System.out.println(Thread.currentThread());
        }
    }
    public static void main(String[] args){
        TestSleep ts=new TestSleep();
        TestSleep ts1=new TestSleep();
        ts.start();
        ts1.start();
    }

}
