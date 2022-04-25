package Homework5.Factory1.idcard;
import Homework5.Factory1.framework.*;
import java.util.*;

/**
 * 具体工厂1：ID卡工厂
 * 用于实例化ID卡对象
 */
public class IDCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}
