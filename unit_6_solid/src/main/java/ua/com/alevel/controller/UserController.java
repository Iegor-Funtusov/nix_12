package ua.com.alevel.controller;

import ua.com.alevel.BeanClass;
import ua.com.alevel.InjectBean;
import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.util.Collection;

@BeanClass
@ua.com.alevel.Controller
public class UserController implements Controller {

    @InjectBean
    private UserService userService;

//    @InjectBean
//    private CustomerService customerService;

    public void create() {
        System.out.println("UserController.create");
        User user = new User();
        userService.create(user);
    }

    public Collection<User> findAll() {
        return userService.findAll();
    }
}
