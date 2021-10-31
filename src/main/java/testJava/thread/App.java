package testJava.thread;

import java.util.*;

public class App {

    public static void main(String[] args) {

        TestThread tt = new TestThread();
        TestThread tt1 = new TestThread();
        TestThread tt2 = new TestThread();

        Thread t1 = new Thread(tt);
        Thread t2 = new Thread(tt1);
        Thread t3 = new Thread(tt2);

        t1.start();
        t2.start();
        t3.start();
    }
}