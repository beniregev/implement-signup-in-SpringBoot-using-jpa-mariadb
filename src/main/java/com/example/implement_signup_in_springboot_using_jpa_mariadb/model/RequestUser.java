package com.example.implement_signup_in_springboot_using_jpa_mariadb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestUser {
    private String userId;
    private String userPassword;
    private String userName;
    private String userEmail;
    private String userAge;
    private String userPn;
    private String userAddress;
    private String userAddress2;

}
