package Homework10;

/**
 * 测试函数
 */
public class Main {
    public static void main(String[] args) {
        // 买了一杯珍珠奶茶，加冰淇凌
        MilkTea pearlMilkTea = new PearlMilkTea();
        pearlMilkTea = new Ice_Cream(pearlMilkTea);
        System.out.print(pearlMilkTea.getName() + " ");
        System.out.println(pearlMilkTea.getPrice() + "元");

        // 买了一杯板栗奶茶，加冰块
        MilkTea chestnutMilkTea = new ChestnutMilkTea();
        chestnutMilkTea = new IceTaste(chestnutMilkTea);
        System.out.print(chestnutMilkTea.getName() + " ");
        System.out.println(chestnutMilkTea.getPrice() + "元");

        /**
         * 半透明修饰：改变接口，增加新的方法
         * 客户端可以生命具体装饰类，并调用具体装饰类中的方法
         */
        Ice_Cream ice_cream = new Ice_Cream(pearlMilkTea);
        System.out.println(ice_cream.ice_Cream_Effect());

        IceTaste iceTaste = new IceTaste(chestnutMilkTea);
        System.out.println(iceTaste.iceEffect());
    }
}
