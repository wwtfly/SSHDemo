package service;

import model.User;

import java.util.List;

public interface UserService {
    public void addUser(User user);

    public void deleteUser(int id);

    public void updateUser(User user);

    public List queryAllUser();

    public User queryByUserID(int id);
}
