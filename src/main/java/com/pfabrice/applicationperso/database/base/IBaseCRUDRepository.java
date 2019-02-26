package com.pfabrice.applicationperso.database.base;

import com.pfabrice.applicationperso.database.DBId;
import org.springframework.data.repository.CrudRepository;

public interface IBaseCRUDRepository<T extends DBId> extends CrudRepository<T,Integer> {
}
