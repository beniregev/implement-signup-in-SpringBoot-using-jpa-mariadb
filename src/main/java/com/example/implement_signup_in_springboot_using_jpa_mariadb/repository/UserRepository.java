package com.example.implement_signup_in_springboot_using_jpa_mariadb.repository;

import com.example.implement_signup_in_springboot_using_jpa_mariadb.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
