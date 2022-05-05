package Homework10;

/**
 * 抽象类：奶茶风味
 * - 风味名称
 * - 额外价格
 */
public class Taste implements MilkTea {
    MilkTea milkTea;
    public Taste(MilkTea milkTea) {
        this.milkTea = milkTea;
    }
    @Override
    public String getName() {
        return milkTea.getName();
    }

    @Override
    public int getPrice() {
        return milkTea.getPrice();
    }
}
