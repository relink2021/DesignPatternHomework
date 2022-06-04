package Homework13;

/**
 * 玩家
 */
public class Player {
    private String name;          // 玩家名称
    private Strategy strategy;    // 使用的策略
    private int winCount;         // 赢的次数
    private int loseCount;        // 输的次数
    private int gameCount;        // 游戏局数
    public Player(String name, Strategy strategy) {
        this.name = name;
        this.strategy = strategy;
    }
    // 下次应该出的手势
    public Hand nextHand() {
        return strategy.nextHand();
    }
    // 赢了
    public void win() {
        strategy.study(true);
        winCount++;
        gameCount++;
    }
    // 输了
    public void lose() {
        strategy.study(false);
        loseCount++;
        gameCount++;
    }
    // 平手
    public void even() {
        gameCount++;
    }
    @Override
    public String toString() {
        return "[" + name + ":" + gameCount + " games, " + winCount + " win, " +
                loseCount + " lose ]";
    }
}
