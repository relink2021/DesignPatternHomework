package Homework4.Specified;

// 用户类
public class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "用户id为" + customerId + '\n' +
                "用户姓名为" + name + '\n';
    }
}
