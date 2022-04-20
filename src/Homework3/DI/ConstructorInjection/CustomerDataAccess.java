package Homework3.DI.ConstructorInjection;

public class CustomerDataAccess implements ICustomerDataAccess {
    public CustomerDataAccess() {
    }

    @Override
    public String getCustomerName(int id) {
        return "Dummy Customer Name";
    }
}
