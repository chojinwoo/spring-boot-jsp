package com.spring.boot.example.user.model;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by bangae1 on 2016-01-07.
 */
@Entity
public class UsersAuth implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Integer seq;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String authority;

    @ManyToOne
    @JoinColumn(name="id",referencedColumnName="id", insertable = false, updatable = false)
    private Users users;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public UsersAuth() {
    }

    public Integer getSeq() {

        return seq;
    }

    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }


    @Override
    public String toString() {
        return "UserAuth{" +
                "seq=" + seq +
                ", id='" + id + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
