/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mathbot.service;
import com.mathbot.model.UsersModel;
/**
 *
 * @author Maven
 */
public class UserServiceImpl implements UsersService{
    @Override
    public void register(String email, String password, String name){
       UsersModel user = new UsersModel();
       user.setEmail(email);
       user.setPassword(password);
}
}
