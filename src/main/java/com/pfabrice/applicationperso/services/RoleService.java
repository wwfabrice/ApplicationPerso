package com.pfabrice.applicationperso.services;

import com.pfabrice.applicationperso.bo.Role;
import com.pfabrice.applicationperso.database.IRoleRepository;
import com.pfabrice.applicationperso.database.base.IBaseCRUDRepository;
import com.pfabrice.applicationperso.services.base.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends BaseService<Role> {

    @Autowired
    private IRoleRepository iRoleRepository;

    @Override
    protected IBaseCRUDRepository<Role> getCrudRepository() {
        return iRoleRepository;
    }
}
