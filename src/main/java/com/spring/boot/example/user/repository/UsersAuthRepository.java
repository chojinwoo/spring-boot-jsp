package com.spring.boot.example.user.repository;

import com.spring.boot.example.user.model.UsersAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Created by bangae1 on 2016-01-07.
 */
public interface UsersAuthRepository extends JpaRepository<UsersAuth, String> {
}
