package com.andy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andy.dao.UserDtoMapper;
import com.andy.model.UserDto;
import com.andy.service.UserService;

@Service
public class UserServiceImpl implements UserService{
 
    @Autowired
    private UserDtoMapper userDAO;
     
    public int insertUser(UserDto user) {
        // TODO Auto-generated method stub
        return userDAO.insert(user);
    }
 
}