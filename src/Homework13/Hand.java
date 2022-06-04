package Homework13;

/**
 * 手势
 */
public class Hand {
    public static final int HANDVALUE_GUU = 0; // 石头
    public static final int HANDVALUE_CHO = 1; // 剪刀
    public static final int HANDVALUE_PAA = 2; // 布
    // 3个示例
    public static final Hand[] hand = {
         new Hand(HANDVALUE_GUU),
         new Hand(HANDVALUE_CHO),
         new Hand(HANDVALUE_PAA),
    };
    // 手势字符串
    private static final String[] name = {
        "石头", "剪刀", "布",
    };
    // 手势的值
    private int handValue;
    private Hand(int handValue) {
        this.handValue = handValue;
    }
    // 返回对应值的实例
    public static Hand getHand(int handValue) {
        return hand[handValue];
    }
    // 赢了则为true
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }
    // 输了则为false
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }
    // 平手则为0
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handValue + 1) % 3 == h.handValue) {
            return 1;
        } else {
            return -1;
        }
    }
    @Override
    public String toString() {
        return name[handValue];
    }
}
