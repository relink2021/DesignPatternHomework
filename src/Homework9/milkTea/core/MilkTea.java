package Homework9.milkTea.core;

/**
 * 抽象类奶茶，有两个作用
 * 1.配置MilkTeaImp接口
 * 2.规定模板方法
 */
public abstract class MilkTea {
    MilkTeaImp milkTeaImp;
    public void setMilkTeaImp() {
        this.milkTeaImp = MilkTeaSingleton.getMilkTeaImp();
    }
    public MilkTeaImp getMilkTeaImp() {
        return this.milkTeaImp;
    }
    public abstract void makeMilkTea();

    /**
     * 模板方法模式：规定方法执行顺序
     * 1.先获得各个子接口类(配方)
     * 2.然后由子类制作不同奶茶
     */
    public final void templateMethod() {
        // 获取温度接口
        getMilkTeaImp().getIceImp().pourIce();
        // 获取加料接口
        getMilkTeaImp().getAddImp().pourMaterial();
        // 获取甜度接口
        getMilkTeaImp().getSweetnessImp().setSweetness();
        // 制作奶茶
        makeMilkTea();
    }
}
