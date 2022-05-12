package Homework12;

import java.util.Observable;

/**
 * 被观察者：数字生成器
 * 继承Observable，使其所有子类都能够被观测
 */
public abstract class NumberGenerator extends Observable {
    public abstract void execute();
}

