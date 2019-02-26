package com.pfabrice.applicationperso.database;

import com.pfabrice.applicationperso.bo.User;
import com.pfabrice.applicationperso.database.base.IBaseCRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends IBaseCRUDRepository<User> {

    User findByEmailUser (String email);
}
