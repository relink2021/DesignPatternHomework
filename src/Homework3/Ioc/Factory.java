package Homework3.Ioc;

// 工厂类，用于产生B的实例
public class Factory {
    // 产生实例B的静态方法
    public static B getObjectOfB() {
        return new B();
    }
}
