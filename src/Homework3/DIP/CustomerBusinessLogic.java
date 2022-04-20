package Homework3.DIP;

// 高级模块：改变CustomerBusinessLogic，使其使用接口
public class CustomerBusinessLogic {
    ICustomerDataAccess iCustomerDataAccess;

    public CustomerBusinessLogic() {
        iCustomerDataAccess = DataAccessFactory.getCustomerDataAccessObj();
    }

    public String getCustomerName(int id) {
        return iCustomerDataAccess.getCustomerName(id);
    }
}
