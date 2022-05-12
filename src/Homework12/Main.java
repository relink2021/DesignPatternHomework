package Homework12;

// 测试函数
public class Main {
    public static void main(String[] args) {
        // 初始化随机数生成器和观察者类
        NumberGenerator generator = new RandomNumberGenerator();
        DigitObserver observer1 = new DigitObserver();
        GraphObserver observer2 = new GraphObserver();
        // 观察者订阅被观察类
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        // 被观察类开始执行，观察者开始发送观察结果
        generator.execute();
    }
}
