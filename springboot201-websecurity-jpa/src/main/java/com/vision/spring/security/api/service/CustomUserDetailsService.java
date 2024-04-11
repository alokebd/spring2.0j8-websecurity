package com.vision.spring.security.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.vision.spring.security.api.model.UserCredential;
import com.vision.spring.security.api.repository.UserInformationRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserInformationRepository repository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserCredential user = repository.findByUsername(username);
		CustomUserDetails userDetails = null;
		if (user != null) {
			userDetails = new CustomUserDetails();
			userDetails.setUser(user);
		} else {
			throw new UsernameNotFoundException("UserCredential not exist with name : " + username);
		}
		return userDetails;

	}

}
