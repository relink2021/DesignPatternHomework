package Homework1;

import java.util.ArrayList;

class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;
    public static ArrayList<DoubleLockSingleton> list = new ArrayList<>();

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Running " + threadName);
        DoubleLockSingleton doubleLockSingleton = DoubleLockSingleton.getInstance();
        list.add(doubleLockSingleton);
    }

    public void start() throws InterruptedException {
        if(t == null) {
            t = new Thread(this, threadName);
            t.start();
            t.join();
        }
    }
}
