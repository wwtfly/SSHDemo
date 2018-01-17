package controller;

import com.opensymphony.xwork2.ActionSupport;
import service.UserService;
import service.UserServiceFactory;


public class DeleteAction extends ActionSupport {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String execute() throws Exception {
        UserService userService= UserServiceFactory.getUserServiceInstance();
        userService.deleteUser(id);
        return SUCCESS;
    }
}
