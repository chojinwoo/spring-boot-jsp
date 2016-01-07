package com.spring.boot.example.user.dao;

import com.spring.boot.example.user.model.Users;
import com.spring.boot.example.user.model.UsersAuth;
import com.spring.boot.example.user.repository.UsersAuthRepository;
import com.spring.boot.example.user.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by bangae1 on 2016-01-07.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private UsersAuthRepository usersAuthRepository;

    @Override
    public List<Users> loadUserByUsername(String username) {
        return usersRepository.findAll();
    }
}
