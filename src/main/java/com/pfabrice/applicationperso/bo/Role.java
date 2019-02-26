package com.pfabrice.applicationperso.bo;

import com.pfabrice.applicationperso.database.DBId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "role")
public class Role extends DBId {

    @Column(name = "name_role")
    private String nameRole;

    @Column(name = "active_Role")
    private int activeRole;

    @OneToMany(targetEntity = User.class,mappedBy = "role")
    private List<User> users;

    /**
     * Getteurs - Setteurs
     */
    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }

    public int getActiveRole() {
        return activeRole;
    }

    public void setActiveRole(int activeRole) {
        this.activeRole = activeRole;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    /**
     * Constructeurs
     */
    public Role() {
        this.users = new ArrayList<>();
    }

    public Role(String nameRole, int activeRole) {
        this();
        this.nameRole = nameRole;
        this.activeRole = activeRole;
    }
}
