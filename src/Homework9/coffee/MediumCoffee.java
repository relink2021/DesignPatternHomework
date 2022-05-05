package Homework9.coffee;

/**
 * 中杯，pourCoffee控制行为
 */
public class MediumCoffee extends Coffee {
    public MediumCoffee() {
        setCoffeeImp();
    }
    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        coffeeImp.pourCoffeeImp();
        System.out.println("中杯");
    }
}
