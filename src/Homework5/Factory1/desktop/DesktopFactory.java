package Homework5.Factory1.desktop;

import Homework5.Factory1.framework.Factory;
import Homework5.Factory1.framework.Product;

import java.util.Vector;

/**
 * 具体工厂2：笔记本工厂
 * 用于实例化笔记本对象
 */
public class DesktopFactory extends Factory {
    private Vector owners = new Vector();

    @Override
    protected Product createProduct(String owner) {
        return new Desktop(owner);
    }

    protected void registerProduct(Product product) {
        owners.add(((Desktop)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}
