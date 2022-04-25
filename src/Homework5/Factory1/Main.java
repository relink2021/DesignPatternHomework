package Homework5.Factory1;

import Homework5.Factory1.desktop.*;
import Homework5.Factory1.framework.*;
import Homework5.Factory1.idcard.*;

public class Main {
    public static void main(String[] args) {
        // 使用工厂创建ID卡并使用
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("张三");
        Product card2 = factory.create("李四");
        Product card3 = factory.create("王五");
        card1.use();
        card2.use();
        card3.use();
        // 使用工厂创建笔记本电脑并使用
        factory = new DesktopFactory();
        Product desktop1 = factory.create("你");
        Product desktop2 = factory.create("我");
        desktop1.use();
        desktop2.use();
    }
}


