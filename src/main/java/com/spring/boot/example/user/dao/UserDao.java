package com.spring.boot.example.user.dao;

import com.spring.boot.example.user.model.Users;

import java.util.List;

/**
 * Created by bangae1 on 2016-01-07.
 */
public interface UserDao {
    public List<Users> loadUserByUsername(String username) ;
}
