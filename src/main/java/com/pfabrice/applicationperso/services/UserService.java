package com.pfabrice.applicationperso.services;

import com.pfabrice.applicationperso.bo.User;
import com.pfabrice.applicationperso.database.IUserRepository;
import com.pfabrice.applicationperso.database.base.IBaseCRUDRepository;
import com.pfabrice.applicationperso.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    protected IBaseCRUDRepository<User> getCrudRepository() {
        return iUserRepository;
    }

    public User findByEmailUser(String email){
        return iUserRepository.findByEmailUser(email);
    }
}
