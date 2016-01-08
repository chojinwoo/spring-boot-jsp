package com.spring.boot.example.user.repository;

import com.spring.boot.example.user.model.UsersAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by bangae1 on 2016-01-07.
 */
public interface UsersAuthRepository extends JpaRepository<UsersAuthEntity, String> {
}
