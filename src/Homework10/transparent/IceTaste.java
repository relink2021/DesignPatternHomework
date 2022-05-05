package Homework10.transparent;

public class IceTaste extends Taste {
    private String description = "加冰";

    public IceTaste(MilkTea milkTea) {
        super(milkTea);
    }
    // 添加属性
    public String getName() {
        return super.getName() + " " + description;
    }
    // 加冰多加3块
    public int getPrice() {
        return super.getPrice() + 3;
    }
    // 半透明装饰
    public String iceEffect() {
        return "奶茶很冰";
    }
}
