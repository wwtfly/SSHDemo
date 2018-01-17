package model;

public class UserDaoFactory {
    public static UserDao getUserDaoInstance() {
        return new UserDaoImpl();
    }
}
