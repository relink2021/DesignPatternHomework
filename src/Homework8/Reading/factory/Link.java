package Homework8.Reading.factory;

/**
 * 抽象Link
 * 由链接名称和具体链接组成
 */
public abstract class Link extends Item {
    //为何Link还是抽象类？Link中有抽象方法么？
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
