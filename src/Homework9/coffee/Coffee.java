package Homework9.coffee;

/**
 * 获取CoffeeImp实例，利用coffeeImp指示Coffee的行为
 * pourCoffee：加料
 */
public abstract class Coffee {
    CoffeeImp coffeeImp;
    public void setCoffeeImp() {
        this.coffeeImp = CoffeeImpSingleton.getCoffeeImp();
    }
    public CoffeeImp getCoffeeImp() { return this.coffeeImp; }
    public abstract void pourCoffee();
}
