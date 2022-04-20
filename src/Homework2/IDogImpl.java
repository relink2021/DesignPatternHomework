package Homework2;

/**
 * 狗接口实现类
 */
public class IDogImpl implements IDog{

    @Override
    public void dogLooks() {
        System.out.println("我像一条狗");
    }

    @Override
    public void dogBark() {
        System.out.println("我会犬吠");
    }
}
