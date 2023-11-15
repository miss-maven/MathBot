package com.example.MathBot.controller;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
 
 
    public boolean validateUser(String userid, String password) {
        return userid.equalsIgnoreCase("admin")
                && password.equalsIgnoreCase("password");
    }
 
}
 
