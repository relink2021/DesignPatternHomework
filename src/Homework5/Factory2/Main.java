package Homework5.Factory2;

/**
 * 测试函数
 * 需要初始化一只动物，但不关心是什么动物
 * 应用场景：游戏中怪物的随机生成
 */
public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new RandomAnimalFactory();
        Animal animal1 = factory.createAnimal();
        Animal animal2 = factory.createAnimal();
        Animal animal3 = factory.createAnimal();
        animal1.display();
        animal2.display();
        animal3.display();
    }
}
