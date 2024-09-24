package multiThreading;


import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.ThreadLocalRandom;

public class MyThread {
    public static void main(String[] args){

        System.out.println("hello world");

        Thread t = new Thread(()->
                System.out.println("Thread 1 is running")
        );
            t.start();

            Runnable r = ()->{
                    System.out.println("Thread 2 is started");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2 is completed");
            };
            Thread thread = new Thread(r);
            thread.start();

    }
}
