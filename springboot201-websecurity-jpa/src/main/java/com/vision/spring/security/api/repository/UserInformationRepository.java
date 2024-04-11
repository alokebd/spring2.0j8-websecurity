package com.vision.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vision.spring.security.api.model.UserCredential;

public interface UserInformationRepository extends JpaRepository<UserCredential, Integer>{

	UserCredential findByUsername(String username);

}
