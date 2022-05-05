package Homework9.coffee;

public class CoffeeImpSingleton {
    private static CoffeeImp coffeeImp;
    public CoffeeImpSingleton(CoffeeImp coffeeImp) {
        this.coffeeImp = coffeeImp;
    }
    public static CoffeeImp getCoffeeImp() {
        return coffeeImp;
    }
}
