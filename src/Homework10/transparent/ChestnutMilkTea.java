package Homework10.transparent;

/**
 * 具体类：板栗奶茶
 */
public class ChestnutMilkTea implements MilkTea {
    @Override
    public String getName() {
        return "板栗奶茶";
    }

    @Override
    public int getPrice() {
        return 13;
    }

    // 半透明的修饰模式
    public String chestnutMethod() {
        return "板栗奶茶特有的方法";
    }
}
