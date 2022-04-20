package Homework1;

public class DoubleLockSingletonMain {
    public static void main(String[] args) throws InterruptedException {
        /**
         * 初始化五个线程
         */
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1");
        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2");
        RunnableDemo runnableDemo3 = new RunnableDemo("Thread3");
        RunnableDemo runnableDemo4 = new RunnableDemo("Thread4");
        RunnableDemo runnableDemo5 = new RunnableDemo("Thread5");
        /**
         * 启动五个线程
         */
        runnableDemo1.start();
        runnableDemo2.start();
        runnableDemo3.start();
        runnableDemo4.start();
        runnableDemo5.start();
        for(DoubleLockSingleton token : RunnableDemo.list) {
            System.out.println(token.getVal());
        }
        RunnableDemo.list.get(0).setVal(3381);
        for(DoubleLockSingleton token : RunnableDemo.list) {
            System.out.println(token.getVal());
        }
    }
}
