package Homework4.Specified;

// 商品类
public class Product {
    private int productId;
    private String name;
    private String Type;

    public Product(int productId, String name, String type) {
        this.productId = productId;
        this.name = name;
        Type = type;
    }

    @Override
    public String toString() {
        return "分享商品的id为: " + productId + "\n" + "分享商品的名称为: " + name + "\n" +
                "产品的类型为: " + Type;
    }
}
