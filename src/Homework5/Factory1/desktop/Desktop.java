package Homework5.Factory1.desktop;

import Homework5.Factory1.framework.*;

/**
 * 具体产品2：笔记本电脑
 */
public class Desktop extends Product {
    private String owner;

    public Desktop(String owner) {
        System.out.println("创建" + owner + "的笔记本电脑");
        this.owner = owner;
    }

    public void send(String message) {
        System.out.println("message");
    }

    @Override
    public void use() {
        System.out.println(owner + "使用电脑发送了一条信息:");
        send("Hello World");
    }

    public String getOwner() {
        return owner;
    }
}
