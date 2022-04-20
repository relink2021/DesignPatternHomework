package Homework2;

/**
 * 猫接口实现类
 */
public class ICatImpl implements ICat{

    @Override
    public void catLooks() {
        System.out.println("我像一只猫");
    }

    @Override
    public void catchMouse() {
        System.out.println("我能抓老鼠");
    }
}
