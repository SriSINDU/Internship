package multithreading;

public class PriorityThreads extends Thread {
    public void run(){
        System.out.println("running thread name is:"+Thread.currentThread().getName());
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());

    }
    public static void main(String[] args){
        PriorityThreads m1=new PriorityThreads();
        PriorityThreads m2=new PriorityThreads();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.setName("sri");
        m2.setName("Sindhu");
        m1.start();
        m2.start();

    }
}
