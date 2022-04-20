package Homework3.DI.PropertyInjection;

public class CustomerBusinessLogic {

    ICustomerDataAccess dataAccess;

    public CustomerBusinessLogic() {
    }

    public String processCustomerData(int id) {
        return dataAccess.getCustomerName(id);
    }
    // 使用Getter和Setter进行注入
    public ICustomerDataAccess getDataAccess() {
        return dataAccess;
    }

    public void setDataAccess(ICustomerDataAccess dataAccess) {
        this.dataAccess = dataAccess;
    }
}
