package com.example.test.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="t_user")
public class User {
    @Id
    private String userId;

    @Column
    private String password;
    @Column
    private String username;
    @Column
    private String useYn;
    @Column
    private String loginFailCnt;
}
