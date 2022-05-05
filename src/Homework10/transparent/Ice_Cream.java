package Homework10.transparent;

public class Ice_Cream extends Taste {
    private String description = "加冰淇凌";

    public Ice_Cream(MilkTea milkTea) {
        super(milkTea);
    }
    // 添加属性
    public String getName() {
        return super.getName() + " " + description;
    }
    // 额外付5元
    public int getPrice() {
        return super.getPrice() + 5;
    }
    // 半透明装饰
    public String ice_Cream_Effect() {
        return "冰淇凌很甜";
    }
}
