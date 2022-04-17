package com.example.implement_signup_in_springboot_using_jpa_mariadb.service;

import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserDTO;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserEntity;
import com.example.implement_signup_in_springboot_using_jpa_mariadb.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService implements IUserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserEntity createUser(UserDTO pDTO) throws Exception {
        log.info(this.getClass().getName() + ".createUser(UserDTO) Start");

        pDTO.setUserPassword("EncPassword");
        pDTO.setUserStatus(1);
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration()
                .setFieldAccessLevel(Configuration.AccessLevel.PRIVATE)
                .setFieldMatchingEnabled(true);
        UserEntity pEntity = mapper.map(pDTO, UserEntity.class);
        return userRepository.save(pEntity);
    }

}
