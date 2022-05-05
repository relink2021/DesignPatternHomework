package Homework9.milkTea.kind;

import Homework9.milkTea.core.MilkTea;

public class Coffee extends MilkTea {
    public Coffee() {
        setMilkTeaImp();
    }
    @Override
    public void makeMilkTea() {
        System.out.println("咖啡奶盖");
    }
}
