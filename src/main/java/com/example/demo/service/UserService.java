package com.example.demo.service;


import com.example.demo.model.UserModel;

public class UserService {
    
    public UserModel editUser(UserModel user){
        UserModel userModel = new UserModel();
        userModel.setFirstName(user.getFirstName());
        userModel.setLastName(user.getLastName());
        userModel.setDob(user.getDob());
        userModel.setEmail(user.getEmail());
        return userModel;
    }
}
