package Homework14;

import javafx.scene.Parent;

/* Component: 抽象类Entry */
public abstract class Entry {
    public abstract String getName(); /* 获取文件名 */
    public abstract int getSize();    /* 获取文件容量 */
    /* 新增进入点 */
    public Entry add(Entry entry) throws Exception {
        throw new Exception();
    }
    /* 输出总览 */
    public void printList_() {
        printList("");
    }
    /* 加上prefix */
    protected abstract void printList(String prefix);
    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}
