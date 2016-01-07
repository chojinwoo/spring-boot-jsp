package com.spring.boot.example.user.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by bangae1 on 2016-01-07.
 */
@Entity
public class Users implements Serializable {
    @Id
    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Integer enabled;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<UsersAuth> usersAuth;


    public Users() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Set<UsersAuth> getUsersAuth() {
        return usersAuth;
    }

    public void setUsersAuth(Set<UsersAuth> usersAuth) {
        this.usersAuth = usersAuth;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", enabled=" + enabled +
                ", usersAuth=" + usersAuth +
                '}';
    }
}
