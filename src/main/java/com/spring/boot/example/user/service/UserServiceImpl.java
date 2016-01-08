package com.spring.boot.example.user.service;

import com.spring.boot.example.user.dao.UserDao;
import com.spring.boot.example.user.model.UsersAuthEntity;
import com.spring.boot.example.user.model.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by bangae1 on 2016-01-07.
 */
@Service
public class UserServiceImpl implements UserDetailsService {
    @Autowired
    private UserDao userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public UserDetails loadUserByUsername(String username) {
        UsersEntity users = userDao.loadUserByUsername(username);
        Set<UsersAuthEntity> list = users.getUsersAuthEntity();

        HashSet<GrantedAuthority> set = new HashSet<GrantedAuthority>();
        for(UsersAuthEntity usersAuth : list) {
            final String auth = usersAuth.getAuthority();
            set.add(new GrantedAuthority() {
                @Override
                public String getAuthority() {
                    return auth;
                }
            });
        }
        users.setAuthorities(set);
        return users;
    }
}
