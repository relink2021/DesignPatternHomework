package Homework3.DI.MethodInjection;

// CustomerBusinessLogic必须实现IDataAccessDependency，以此配置DataAccess
public class CustomerBusinessLogic implements IDataAccessDependency {
    ICustomerDataAccess dataAccess;

    public CustomerBusinessLogic() {
    }

    public String getCustomerName(int id) {
        return dataAccess.getCustomerName(id);
    }

    @Override
    public void setDependency(ICustomerDataAccess customerDataAccess) {
        dataAccess = customerDataAccess;
    }
}
