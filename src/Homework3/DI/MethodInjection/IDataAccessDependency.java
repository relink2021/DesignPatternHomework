package Homework3.DI.MethodInjection;

// 使用接口解决配置问题
public interface IDataAccessDependency {
    void setDependency(ICustomerDataAccess customerDataAccess);
}
