package com.example.implement_signup_in_springboot_using_jpa_mariadb.controller;

import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.RequestUser;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserDTO;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserEntity;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@Slf4j
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping(path = "/users")
    public ResponseEntity<UserEntity> createUser(@RequestBody RequestUser requestUser) throws Exception {
        log.info(this.getClass().getName() + ".createUser(RequestUser) start!");
        UserDTO userDTO = new ModelMapper().map(requestUser, UserDTO.class);
        UserEntity resEntity = userService.createUser(userDTO);
        URI location = URI.create(String.format("/persons/%s", resEntity.getUserName()));
        return ResponseEntity.created(location).body(resEntity);
    }

}
