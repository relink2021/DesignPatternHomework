package Homework5.Factory2;

import java.util.Random;

/**
 * 具体工厂类：
 * 假定这是一个游戏，需要无时不刻随机产生动物
 * 可以使用随机工厂来达成目标
 */
public class RandomAnimalFactory extends AnimalFactory {

    @Override
    protected Animal createAnimal() {
        Random random = new Random();
        int type = random.nextInt(3);
        switch (type) {
            case 0: return new Cat();
            case 1: return new Dog();
            case 2: return new Duck();
        }
        return null;
    }
}
