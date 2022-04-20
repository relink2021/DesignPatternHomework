package Homework3.DIP;

public class Main {
    public static void main(String[] args) {
        CustomerBusinessLogic customerBusinessLogic = new CustomerBusinessLogic();
        System.out.println(customerBusinessLogic.getCustomerName(1));
    }
}
