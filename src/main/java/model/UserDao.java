package model;

import model.User;

import java.util.List;

public interface UserDao {
    public void save(User user);

    public void delete(int id);

    public void update(User user);

    public List queryAll();

    public User queryByID(int id);
}
