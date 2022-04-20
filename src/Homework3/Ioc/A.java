package Homework3.Ioc;

// 类A，需要依赖类B完成Task
public class A {
    B b;
    // A通过工厂类获取b的对象，而不参与B的创建
    public A() {
        b = Factory.getObjectOfB();
    }

    public void Task() {
        b.someMethod();
    }
}
