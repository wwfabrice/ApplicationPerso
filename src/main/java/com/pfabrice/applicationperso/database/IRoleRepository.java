package com.pfabrice.applicationperso.database;

import com.pfabrice.applicationperso.bo.Role;
import com.pfabrice.applicationperso.database.base.IBaseCRUDRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoleRepository extends IBaseCRUDRepository<Role> {
}
