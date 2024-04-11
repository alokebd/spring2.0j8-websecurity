package com.vision.spring.security.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.vision.spring.security.api.model.UserCredential;
import com.vision.spring.security.api.repository.UserInformationRepository;

@Service
public class AdminUserService {
	@Autowired
	UserInformationRepository repository;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	 public String addUser(UserCredential user) {
		 user.setPassword(passwordEncoder.encode(user.getPassword()));
	     repository.save(user);
	     return "user added to system ";
	 }
}
