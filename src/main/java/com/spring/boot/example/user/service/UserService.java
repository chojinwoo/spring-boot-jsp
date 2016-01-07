package com.spring.boot.example.user.service;


import java.util.List;

/**
 * Created by bangae1 on 2016-01-08.
 */
public interface UserService {
    public List loadUserByUsername(String username);
}
