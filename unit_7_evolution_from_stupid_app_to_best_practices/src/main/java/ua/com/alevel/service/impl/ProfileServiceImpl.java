package ua.com.alevel.service.impl;

import org.nixsolutions.annotations.Autowired;
import org.nixsolutions.annotations.Service;
import ua.com.alevel.dao.ProfileDao;
import ua.com.alevel.entity.Profile;
import ua.com.alevel.service.ProfileService;

import java.util.Collection;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileDao profileDao;

    @Override
    public void create(Profile entity) {

    }

    @Override
    public void update(Profile entity) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Profile findById(Integer id) {
        return null;
    }

    @Override
    public Collection<Profile> findAll() {
        return null;
    }
}
