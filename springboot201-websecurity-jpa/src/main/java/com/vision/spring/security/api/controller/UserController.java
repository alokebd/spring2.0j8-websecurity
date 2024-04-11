package com.vision.spring.security.api.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vision.spring.security.api.service.CustomUserDetails;
import com.vision.spring.security.api.service.CustomUserDetailsService;

@RestController
@RequestMapping("/secure/auth")
public class UserController {
	
	@Autowired
	private CustomUserDetailsService service;
	
	//@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
	@GetMapping("/welcome")
	public String securedHello(Principal principal) {
		return "Hello " +principal.getName()+", Welcome!, you are securied";
	}
	
	//@PreAuthorize("hasAnyRole('ROLE_USER')")
	@GetMapping("/users")
	public String getUserInfo(@RequestParam("username") String username) {
		UserDetails userDetails =service.loadUserByUsername(username);
		CustomUserDetails customUserDetails = (CustomUserDetails)userDetails;
		return userDetails.getUsername() +" your email:"+customUserDetails.getEmail() + ", and your role:"+ customUserDetails.getRole();
	}
	

}
