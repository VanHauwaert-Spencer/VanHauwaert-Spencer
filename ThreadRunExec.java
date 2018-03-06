
// A basic program that uses threads, runnables, and an executor

import java.util.concurrent.*;

class MyThread implements Runnable {
    String name;
    CountDownLatch number;
    
    MyThread(CountDownLatch c, String n){
        number = c;
        name = n;
        
        new Thread(this);
    }
    
    public void run() {
        
        for(int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            number.countDown();
        }
    }
}


class ThreadRunExec {
    
    public static void main(String[] args) {
        CountDownLatch cdl1 = new CountDownLatch(5);
        CountDownLatch cdl2 = new CountDownLatch(5);
        CountDownLatch cdl3 = new CountDownLatch(5);
        CountDownLatch cdl4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(4);
        
        System.out.println("Starting");
        
        //Start the threads
        es.execute(new MyThread(cdl1, "A"));
        es.execute(new MyThread(cdl2, "B"));
        es.execute(new MyThread(cdl3, "C"));
        es.execute(new MyThread(cdl4, "D"));
        
        try{
            cdl1.await();
            cdl2.await();
            cdl3.await();
            cdl4.await();
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
        
        es.shutdown(); // Needed to end the executable
        System.out.println("Done");
    }
}