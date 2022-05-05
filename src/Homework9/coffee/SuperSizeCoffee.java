package Homework9.coffee;

/**
 * 大杯，pourCoffee控制行为
 */
public class SuperSizeCoffee extends Coffee {
    public SuperSizeCoffee() {
        setCoffeeImp();
    }
    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        coffeeImp.pourCoffeeImp();
        System.out.println("大杯");
    }
}
