package Homework12;

import java.util.Observable;
import java.util.Observer;

/**
 * 数字观察者
 * 继承Observer，重写update逻辑即可，接受改变的参数并输出
 */
public class DigitObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("DigitObserver:" + arg);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
