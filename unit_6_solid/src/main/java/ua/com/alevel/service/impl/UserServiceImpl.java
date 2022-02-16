package ua.com.alevel.service.impl;

import ua.com.alevel.BeanClass;
import ua.com.alevel.InjectBean;
import ua.com.alevel.dao.UserDao;
import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.util.Collection;
import java.util.Optional;

@BeanClass
public class UserServiceImpl implements UserService {

    @InjectBean
    private UserDao userDao;

    @Override
    public void create(User entity) {
        System.out.println("UserServiceImpl.create");
        userDao.create(entity);
    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public Optional<User> findById(String id) {
        return Optional.empty();
    }

    @Override
    public Collection<User> findAll() {
        return userDao.findAll();
    }
}
