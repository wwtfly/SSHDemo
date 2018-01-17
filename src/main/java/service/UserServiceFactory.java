package service;

public class UserServiceFactory {
    public static UserService getUserServiceInstance() {
        return new UserServiceImpl();
    }
}
