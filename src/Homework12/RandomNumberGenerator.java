package Homework12;

import java.util.Random;

/**
 * 具体的被观察者：随机数生成器
 * 仍然继承数字生成器，具体实现一种数字生成方式
 */
public class RandomNumberGenerator extends NumberGenerator {
    private Random random = new Random();
    private int number;
    public void execute() {
        for (int i = 0; i < 10; i++) {
            /**
             * 在变化的地方设置setChanged()进行监测
             * 使用notifyObservers(Object arg)方法将改变的参数发送给所有观察者
             */
            super.setChanged();
            super.notifyObservers(number);
            number = random.nextInt(50);
        }
    }

}

