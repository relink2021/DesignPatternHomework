package Homework9.milkTea;

import Homework9.milkTea.addition.Ice_Cream;
import Homework9.milkTea.addition.Pearl;
import Homework9.milkTea.core.MilkTeaImp;
import Homework9.milkTea.core.MilkTeaSingleton;
import Homework9.milkTea.kind.Chestnut;
import Homework9.milkTea.kind.Coffee;
import Homework9.milkTea.sweetness.Full_Point;
import Homework9.milkTea.sweetness.Three_Point;
import Homework9.milkTea.temp.MiddleIce;
import Homework9.milkTea.temp.NoIce;

/**
 * 测试函数
 * 可以尝试加入多种属性或属性条目
 * 1.加入属性：新增属性接口和若干属性条目，在MilkTeaImp中注册，并在模板方法中添加属性模板方法
 * 2.加入属性条目：新增一个类并继承目标属性即可
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 使用单例模式确保只有一个MilkTeaImp存在
         * 在实例化MilkTeaImp的同时指定配方
         */
        MilkTeaSingleton milkTeaSingleton = new MilkTeaSingleton(new MilkTeaImp(new NoIce(), new Pearl(), new Full_Point()));
        Coffee coffee = new Coffee();
        coffee.templateMethod();
        /** 实例化多种口味奶茶 */
        milkTeaSingleton = new MilkTeaSingleton(new MilkTeaImp(new MiddleIce(), new Ice_Cream(), new Three_Point()));
        Chestnut chestnut = new Chestnut();
        chestnut.templateMethod();
    }
}
