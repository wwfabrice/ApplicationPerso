package com.pfabrice.applicationperso.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    public static final String FORM_EMAIL = "email";
    public static final String FORM_PASSWORD = "password";

    public static final String URL_LOGIN = "/login";
    private static final String VIEW_LOGIN = "/security/login";


    @RequestMapping(value = URL_LOGIN, method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("form_email",FORM_EMAIL);
        model.addAttribute("form_password",FORM_PASSWORD);
        return VIEW_LOGIN;
    }
}
