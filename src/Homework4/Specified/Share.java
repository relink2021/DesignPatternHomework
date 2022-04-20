package Homework4.Specified;

// 一条分享信息的记录
public class Share {
    private Customer sharer;  // 分享商品的用户信息
    private Customer buyer;   // 购买分享商品信息的人
    private Product product;  // 分享的商品详情

    public Share(Customer sharer, Customer buyer, Product product) {
        this.sharer = sharer;
        this.buyer = buyer;
        this.product = product;
    }

    @Override
    public String toString() {
        return "分享者信息如下:\n" + sharer +
                "购买者信息如下:\n" + buyer +
                "分享商品详情如下:\n" + product;
    }
}
