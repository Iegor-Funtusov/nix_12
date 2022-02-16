package ua.com.alevel.dao.impl;

import ua.com.alevel.BeanClass;
import ua.com.alevel.dao.UserDao;
import ua.com.alevel.entity.User;

import java.util.Collection;
import java.util.Optional;

@BeanClass
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl.UserDaoImpl");
    }

    @Override
    public void create(User entity) {
        System.out.println("UserDaoImpl.create");
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
        return null;
    }
}
