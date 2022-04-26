package Homework8.Reading.factory;

/**
 * 抽象的Item，要显示的页面元素
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
