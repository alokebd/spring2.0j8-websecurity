package com.vision.spring.security.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vision.spring.security.api.model.CredentialRoles;

public interface RoleRepository extends JpaRepository<CredentialRoles, Integer>{

}
