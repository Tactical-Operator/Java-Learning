import java.util.*;

class Counter{
    int count;
    synchronized void increment() // because of synchronized keywors the two threads will start functioning one after the other
    {
        count++;
    }
}

class synchronization_example{
    public static void main(String []args) throws InterruptedException
    {
        Counter c=new Counter();

        Thread t1=new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=1;i<=10000;i++){
                    c.increment();
                }
            }
            
        });

        Thread t2=new Thread(new Runnable() {
            @Override
            public void run(){
                for(int i=1;i<=10000;i++){
                    c.increment();
                }
            }
            
        });

        t1.start();;
        t2.start();
        t1.join();
        t2.join();
        System.out.println(c.count); // if the method increment is synchronized then it will print random values.
    }
}