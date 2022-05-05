package Homework9.milkTea.core;

import Homework9.milkTea.addition.AddImp;
import Homework9.milkTea.sweetness.SweetnessImp;
import Homework9.milkTea.temp.IceImp;

/**
 * 奶茶配置接口
 * 1.温度
 * 2.加料
 * 3.甜度
 * 牺牲了一定松散耦合，获取更多属性的桥接
 */
public class MilkTeaImp {
    private static IceImp iceImp;
    private static AddImp addImp;
    private static SweetnessImp sweetnessImp;
    public MilkTeaImp(IceImp iceImp, AddImp addImp, SweetnessImp sweetnessImp) {
        this.iceImp = iceImp;
        this.addImp = addImp;
        this.sweetnessImp = sweetnessImp;
    }
    public IceImp getIceImp() {
        return iceImp;
    }
    public void setIceImp(IceImp iceImp) {
        this.iceImp = iceImp;
    }
    public AddImp getAddImp() {
        return addImp;
    }
    public void setAddImp(AddImp addImp) {
        this.addImp = addImp;
    }
    public SweetnessImp getSweetnessImp() {
        return sweetnessImp;
    }
    public void setSweetnessImp(SweetnessImp sweetnessImp) {
        this.sweetnessImp = sweetnessImp;
    }
}
