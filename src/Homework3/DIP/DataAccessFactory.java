package Homework3.DIP;

// 改变工厂类，使其返回接口而非具体的类
public class DataAccessFactory {
    public static ICustomerDataAccess getCustomerDataAccessObj() {
        return new CustomerDataAccess();
    }
}
