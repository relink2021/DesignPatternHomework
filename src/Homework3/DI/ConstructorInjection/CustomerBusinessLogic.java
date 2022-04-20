package Homework3.DI.ConstructorInjection;

// 调用该类现在必须注入一个ICustomerDataAccess对象
public class CustomerBusinessLogic {
    ICustomerDataAccess dataAccess;

    // 包含了一个具有ICustomerDataAccess类型参数的构造函数
    public CustomerBusinessLogic(ICustomerDataAccess custDataAccess) {
        dataAccess = custDataAccess;
    }

    public CustomerBusinessLogic() {
        dataAccess = new CustomerDataAccess();
    }

    public String processCustomerData(int id) {
        return dataAccess.getCustomerName(id);
    }
}
