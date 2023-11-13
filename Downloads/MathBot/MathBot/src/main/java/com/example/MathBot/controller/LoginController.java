package com.example.MathBot.controller;

import com.example.MathBot.controller.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import com.google.common.util.concurrent.Service;
import com.example.MathBot.controller.LoginController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController<service> {
 
    @Autowired
    private Service service; // Autowire the LoginService
 
    // ...
 
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
 
        boolean isValidUser = ((Object) service).validateUser(name, password); // Use the service here
 
        if (!isValidUser) {
            model.put("errorMessage", "Access Denied , Invalid Credentials");
            return "login";
        }
 
        model.put("name", name);
        model.put("password", password);
 
        return "welcome";
    }
 
    // ...
}
