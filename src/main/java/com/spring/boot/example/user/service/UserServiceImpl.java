package com.spring.boot.example.user.service;

import com.spring.boot.example.user.dao.UserDao;
import com.spring.boot.example.user.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by bangae1 on 2016-01-07.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List loadUserByUsername(String username) {
        List<Users> users = userDao.loadUserByUsername(username);
        return users;
    }
}
