package controller;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import service.UserService;
import service.UserServiceFactory;

import java.util.List;

public class ShowAllAction extends ActionSupport {
    public String execute() throws Exception {
        UserService us= UserServiceFactory.getUserServiceInstance();
        List all=us.queryAllUser();
        ServletActionContext.getRequest().setAttribute("all", all);
        return SUCCESS;
    }
}
