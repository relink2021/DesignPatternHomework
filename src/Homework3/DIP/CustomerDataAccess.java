package Homework3.DIP;

// 低级模块：在CustomerDataAccess类中实现
public class CustomerDataAccess implements ICustomerDataAccess {
    @Override
    public String getCustomerName(int id) {
        return "Dummy Customer Name";
    }
}
