package com.stormdev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stormdev.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

}
