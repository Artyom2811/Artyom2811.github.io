package testJava.thread;

import java.util.concurrent.Callable;

public class TestThread implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("chek1");
            Thread.sleep(3000);
            System.out.println("chek2");
            System.out.println("chek3");
        } catch (InterruptedException e ){}
    }
}
