package ua.com.alevel.dao.impl;

import ua.com.alevel.dao.UserDao;
import ua.com.alevel.entity.User;

import java.util.Collection;
import java.util.Optional;

public class UserDaoSuperImpl implements UserDao {

    public UserDaoSuperImpl() {
        System.out.println("UserDaoSuperImpl.UserDaoSuperImpl");
    }

    @Override
    public void create(User entity) {

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
