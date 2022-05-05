package Homework9.milkTea.kind;

import Homework9.milkTea.core.MilkTea;

public class Chestnut extends MilkTea {
    public Chestnut() {
        setMilkTeaImp();
    }
    @Override
    public void makeMilkTea() {
        System.out.println("栗上浓香");
    }
}
