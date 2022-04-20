package Homework3.DI.PropertyInjection;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        System.out.println(customerService.getCustomerName(1));
    }
}
