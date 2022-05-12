package Homework12;

import java.util.Observable;
import java.util.Observer;

/**
 * 图像观察者：
 * 继承Observer，重写update逻辑即可，接受改变的参数，并输出对应个数的*号
 */
public class GraphObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.print("GraphObserver:");
        int count = (int) arg;
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
