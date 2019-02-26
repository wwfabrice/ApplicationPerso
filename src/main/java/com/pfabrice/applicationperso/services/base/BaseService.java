package com.pfabrice.applicationperso.services.base;

import com.pfabrice.applicationperso.database.DBId;
import com.pfabrice.applicationperso.database.base.IBaseCRUDRepository;

public abstract class BaseService<T extends DBId> {

    protected abstract IBaseCRUDRepository<T> getCrudRepository();

    public void save (T item){
        this.getCrudRepository().save(item);
    }
}
