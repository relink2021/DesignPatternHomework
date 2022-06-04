package Homework14;

import java.util.Iterator;
import java.util.Vector;

/* Composite：子节点可能是文件或是目录 */
public class Directory extends Entry {
    private String name; /* 目录名称 */
    private Vector directory = new Vector(); /* 目录进入点集合 */
    private Directory parent; /* 父节点 */
    public void setParent(Directory parent) {
        this.parent = parent;
    }
    public Directory(String name) {
        this.name = name;
    }
    public Directory getParent() {
        return parent;
    }
    /* 获取目录名称 */
    @Override
    public String getName() {
        return name;
    }
    /* 获取目录大小 */
    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }
    /* 进入点的总览 */
    @Override
    protected void printList(String prefix) {
        GUIController.s.add(prefix + "/" + this + '\n');
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            entry.printList(prefix + "/" + name);
        }
    }
    /* 新增进入点 */
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}
