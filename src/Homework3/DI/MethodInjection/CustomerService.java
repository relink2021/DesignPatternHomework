package Homework3.DI.MethodInjection;

public class CustomerService {
    CustomerBusinessLogic customerBusinessLogic;

    public CustomerService()
    {
        customerBusinessLogic = new CustomerBusinessLogic();
        // 通过类型强制转换实现dataAccess的注入
        ((IDataAccessDependency)customerBusinessLogic).setDependency(new CustomerDataAccess());
    }

    public String getCustomerName(int id) {
        return customerBusinessLogic.getCustomerName(id);
    }
}
