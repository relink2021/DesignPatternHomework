package Homework2;

/**
 * 双向适配器
 */
public class Adapter implements ICat, IDog{
    ICat cat = null;
    IDog dog = null;

    public Adapter(ICat cat) {
        this.cat = cat;
    }

    public Adapter(IDog dog) {
        this.dog = dog;
    }


    @Override
    public void catLooks() {
        System.out.println("我是一只猫");
    }

    /**
     * 让猫学会犬吠
     */
    @Override
    public void catchMouse() {
        dog.dogBark();
    }

    @Override
    public void dogLooks() {
        System.out.println("我是一条狗");
    }

    /**
     * 让狗学会抓老鼠
     */
    @Override
    public void dogBark() {
        cat.catchMouse();
    }
}
