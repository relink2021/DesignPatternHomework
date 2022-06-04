package Homework13;

/**
 * 抽象策略接口
 */
public interface Strategy {
    public abstract Hand nextHand();
    public abstract void study(boolean win);
}
