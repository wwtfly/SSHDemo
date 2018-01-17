package service;

import model.UserDaoFactory;
import model.User;
import model.UserDao;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public void addUser(User user) {
        UserDao dao= UserDaoFactory.getUserDaoInstance();
        if (dao.queryByID(user.getId()) == null) {
            dao.save(user);
        } else {
            System.out.println("id已经存在");
        }
    }

    @Override
    public void deleteUser(int id) {
        UserDao dao= UserDaoFactory.getUserDaoInstance();
        if (dao.queryByID(id) != null) {
            dao.delete(id);
        } else {
            System.out.println("id不存在");
        }
    }

    @Override
    public void updateUser(User user) {
        UserDao dao= UserDaoFactory.getUserDaoInstance();
        if (dao.queryByID(user.getId()) != null) {
            dao.update(user);
        } else {
            System.out.println("id不存在");
        }
    }

    @Override
    public List queryAllUser() {
        UserDao dao=UserDaoFactory.getUserDaoInstance();
        return dao.queryAll();
    }

    @Override
    public User queryByUserID(int id) {
        UserDao dao=UserDaoFactory.getUserDaoInstance();
        return dao.queryByID(id);
    }
}
