package controller;

import com.opensymphony.xwork2.ActionSupport;
import model.User;
import service.UserService;
import service.UserServiceFactory;

public class AddUserAction extends ActionSupport {
    private int id;
    private String username;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String execute() throws Exception {
        UserService us= UserServiceFactory.getUserServiceInstance();
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        us.addUser(user);
        return SUCCESS;
    }

}
