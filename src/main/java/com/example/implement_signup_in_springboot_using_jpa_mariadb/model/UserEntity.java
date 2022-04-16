package com.example.implement_signup_in_springboot_using_jpa_mariadb.model;

import lombok.Getter;

import javax.persistence.*;

@Getter
@Entity
@Table(name="userInfo")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userSeq;
    @Column(nullable = false, length = 40, unique = true)
    private String userId;
    @Column(nullable = false, length = 200, unique = true)
    private String userPassword;
    @Column(nullable = false, length = 40)
    private String userName;
    @Column(nullable = false, length = 60, unique = true)
    private String userEmail;
    @Column(nullable = false)
    private String userAge;
    @Column(nullable = false, length = 30)
    private String userPn;
    @Column(nullable = false)
    private int userStatus;
    @Column(length = 80)
    private String userAddress;
    @Column(length = 80)
    private String userAddress2;

}
