package Homework9.coffee;

/**
 * 测试函数
 * 1.大杯加牛奶
 * 2.中杯加糖
 * 3.小杯无添加
 */
public class CoffeeMain {
    public static void main(String[] args) {
        // 大杯加牛奶
        CoffeeImpSingleton coffeeImpSingleton = new CoffeeImpSingleton(new MilkCoffeeImp());
        SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
        superSizeCoffee.pourCoffee();
        // 中杯加糖
        coffeeImpSingleton = new CoffeeImpSingleton(new SugarCoffeeImp());
        MediumCoffee mediumCoffee = new MediumCoffee();
        mediumCoffee.pourCoffee();
        // 小杯无添加
        coffeeImpSingleton = new CoffeeImpSingleton(new FragrantCoffeeImp());
        SmallSizeCoffee smallSizeCoffee = new SmallSizeCoffee();
        smallSizeCoffee.pourCoffee();
    }
}
