package com.example.implement_signup_in_springboot_using_jpa_mariadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String userId;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userAge;
    private String userPn;
    private int userStatus;
    private String userAddress;
    private String userAddress2;
}
