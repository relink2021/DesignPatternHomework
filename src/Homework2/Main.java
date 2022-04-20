package Homework2;

public class Main {
    public static void main(String[] args) {
        /**
         * 把狗适配为猫
         */
        ICat fakeCat = new Adapter(new IDogImpl());
        fakeCat.catLooks();
        fakeCat.catchMouse();
        /**
         * 把猫适配为狗
         */
        IDog fakeDog = new Adapter(new ICatImpl());
        fakeDog.dogLooks();
        fakeDog.dogBark();
    }
}
