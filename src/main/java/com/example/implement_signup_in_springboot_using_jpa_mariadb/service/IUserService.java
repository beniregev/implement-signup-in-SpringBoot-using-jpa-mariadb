package com.example.implement_signup_in_springboot_using_jpa_mariadb.service;

import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserDTO;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserEntity;

public interface IUserService {
    public UserEntity createUser(UserDTO pDTO) throws Exception ;
}
