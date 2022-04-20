package Homework3.DI.ConstructorInjection;

// 注射器类，创建CustomerDataAccess并将其注入到CustomerBusinessLoic中
public class CustomerService {
    CustomerBusinessLogic customerBusinessLogic;

    public CustomerService() {
        customerBusinessLogic = new CustomerBusinessLogic(new CustomerDataAccess());
    }

    public String getCustomerName(int id) {
        return customerBusinessLogic.processCustomerData(id);
    }
}
