package Homework5.Factory1.framework;

/**
 * 抽象工厂
 * 包含实例化一个产品的必要过程
 * 本例中包括：
 * 1.创建产品
 * 2.注册产品呢
 */
public abstract class Factory {
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
