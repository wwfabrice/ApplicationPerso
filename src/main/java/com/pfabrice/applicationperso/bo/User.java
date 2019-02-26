package com.pfabrice.applicationperso.bo;

import com.pfabrice.applicationperso.database.DBId;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends DBId {

    /**
     * Pour la partie Sécurité
     */
    @Column(name = "email_user", unique = true)
    private String emailUser;

    @Column(name = "password_user")
    private String passwordUser;

    @Column(name = "active_user")
    private int activeUser;

    /**
     * Pour la partie Standard
     */
    @Column(name = "lastname_user")
    private String lastnameUser;

    @Column(name = "firstname_user")
    private String firstnameUser;

    @ManyToOne(targetEntity = Role.class)
    private Role role;

    /**
     * Getteurs - Setteurs
     */
    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public int getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(int activeUser) {
        this.activeUser = activeUser;
    }

    public String getLastnameUser() {
        return lastnameUser;
    }

    public void setLastnameUser(String lastnameUser) {
        this.lastnameUser = lastnameUser;
    }

    public String getFirstnameUser() {
        return firstnameUser;
    }

    public void setFirstnameUser(String firstnameUser) {
        this.firstnameUser = firstnameUser;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    /**
     * Constructeurs
     */
    public User() {
    }

    public User(String emailUser, String passwordUser, int activeUser, String lastnameUser, String firstnameUser, Role role) {
        this();
        this.emailUser = emailUser;
        this.passwordUser = passwordUser;
        this.activeUser = activeUser;
        this.lastnameUser = lastnameUser;
        this.firstnameUser = firstnameUser;
        this.role = role;
    }
}
