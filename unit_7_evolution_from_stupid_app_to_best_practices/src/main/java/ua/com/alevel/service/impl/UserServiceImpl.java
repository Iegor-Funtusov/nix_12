package ua.com.alevel.service.impl;

import org.nixsolutions.annotations.Autowired;
import org.nixsolutions.annotations.Service;
import ua.com.alevel.dao.UserDao;
import ua.com.alevel.dao.impl.MySqlUserDaoImpl;
import ua.com.alevel.dao.impl.PostgresUserDaoImpl;
import ua.com.alevel.entity.User;
import ua.com.alevel.service.UserService;

import java.util.Collection;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void create(User entity) {
        userDao.create(entity);
    }

    @Override
    public void update(User entity) {
        exist(entity.getId());
        userDao.update(entity);
    }

    @Override
    public void delete(Integer id) {
        exist(id);
        userDao.delete(id);
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
    }

    @Override
    public Collection<User> findAll() {
        return userDao.findAll();
    }

    private void exist(Integer id) {
        if (!userDao.existsById(id)) {
            throw new RuntimeException("user not found");
        }
    }
}
