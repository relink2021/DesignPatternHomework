package Homework5.Factory2;

/**
 * 动物工厂
 * 用于实例化动物类
 */
public abstract class AnimalFactory {
    public Animal create() {
        return createAnimal();
    }
    protected abstract Animal createAnimal();
}
