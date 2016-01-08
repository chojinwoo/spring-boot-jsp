package com.spring.boot.example.user.dao;

import com.spring.boot.example.user.model.UsersEntity;

/**
 * Created by bangae1 on 2016-01-07.
 */
public interface UserDao {
    public UsersEntity loadUserByUsername(String username) ;
}
