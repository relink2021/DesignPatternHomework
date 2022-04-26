package Homework8.Reading.factory;

import java.util.Vector;

/**
 * Tray：存放Item的容器，使用Vector实现
 */
public abstract class Tray extends Item {
    protected Vector tray = new Vector();
    public Tray(String caption) {
        super(caption);
    }
    public void add(Item item) {
        tray.add(item);
    }
}
