package com.vision.spring.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vision.spring.security.api.model.UserCredential;
import com.vision.spring.security.api.repository.UserInformationRepository;
import com.vision.spring.security.api.service.AdminUserService;

@RestController
@RequestMapping("/api")
public class AdminController {

	@Autowired
	private AdminUserService adminUserService;
	
	@PostMapping("/users")
    public String addNewUser(@RequestBody UserCredential userInfo){
        return adminUserService.addUser(userInfo);
    }
}
