package Homework9.coffee;

/**
 * 小杯，pourCoffee控制行为
 */
public class SmallSizeCoffee extends Coffee {
    public SmallSizeCoffee() {
        setCoffeeImp();
    }
    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        coffeeImp.pourCoffeeImp();
        System.out.println("小杯");
    }
}
