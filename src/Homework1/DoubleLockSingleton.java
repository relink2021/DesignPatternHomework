package Homework1;

/**
 * 双重加锁的单例模式
 */
public class DoubleLockSingleton {
    /**
     * 1.指向自身实例的私有静态引用
     * volatile: 被volatile修饰的变量不会被本地线程缓存，所有对该变量的读写都是直接操作共享内存
     */
    private volatile static DoubleLockSingleton instance = null;
    private int val = 0;

    /**
     * 2.私有的构造方法
     */
    private DoubleLockSingleton() {}

    /**
     * 3.以自身实例为返回值的静态的共有方法
     * synchronized: 同步锁，保证同步区内的操作具有原子性、可见性、有序性
     * 原子性: 一个操作或多个操作，要么全部执行，要么全部不执行
     * 可见性: 多个线程访问一个资源时，该资源的状态、值信息等对于其他线程都是可见的
     * 有序性: 有序性值程序执行的顺序按照代码先后执行
     */
    public static DoubleLockSingleton getInstance() {
        if(instance == null) {
            /**
             * 开启同步区
             */
            synchronized (DoubleLockSingleton.class) {
                if(instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
