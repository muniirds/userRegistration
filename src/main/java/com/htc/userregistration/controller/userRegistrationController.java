package com.htc.userregistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.userregistration.dao.userRegistrationInterface;
import com.htc.userregistration.entity.userRegistration;


@RestController
@RequestMapping("/api")
public class userRegistrationController {

	@Autowired
	userRegistrationInterface userRegistrationInterface;
	
	@PostMapping("/adduser") 
	public userRegistration createNewUser(@RequestBody userRegistration userRegistration) {
		   
		 return userRegistrationInterface.save(userRegistration);
		 
	}
	
}
