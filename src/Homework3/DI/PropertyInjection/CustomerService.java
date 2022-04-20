package Homework3.DI.PropertyInjection;

public class CustomerService {
    CustomerBusinessLogic customerBusinessLogic = new CustomerBusinessLogic();

    public CustomerService() {
        // 使用set方法进行配置
        customerBusinessLogic.setDataAccess(new CustomerDataAccess());
    }

    public String getCustomerName(int id) {
        return customerBusinessLogic.processCustomerData(id);
    }
}
