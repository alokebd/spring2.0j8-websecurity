package com.vision.spring.security.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class CredentialRoles {
	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue
	private int role_id;
	private String role;
	
}
