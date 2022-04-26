package Homework7;

/**
 * 创建者
 * 提供常见文件的固定组件方法
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract Object getResult();
}
