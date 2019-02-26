package com.pfabrice.applicationperso.security.services;

import com.pfabrice.applicationperso.bo.Role;
import com.pfabrice.applicationperso.bo.User;
import com.pfabrice.applicationperso.services.RoleService;
import com.pfabrice.applicationperso.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PreLaunchService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public void createFirstAdmin (){
        if (!isExist("superadmin@gmail.com")) {
            Role role = new Role("ROLE_ADMINISTRATEUR",1);
            User user = new User("superadmin@gmail.com","superadmin",1,"SUPER","Admin",role);
            user.setPasswordUser(bCryptPasswordEncoder.encode(user.getPasswordUser()));
            roleService.save(role);
            userService.save(user);
        }
    }

    private boolean isExist (String email){
        boolean result = false;
        User user = userService.findByEmailUser(email);
        if (user != null) {
            result = true;
        }
        return result;
        /**
         * Exemple d'une ternaire : return (user != null) ? true : false;
         */
    }
}
