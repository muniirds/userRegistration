package com.htc.userregistration.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.userregistration.entity.userRegistration;



public interface userRegistrationInterface  extends JpaRepository<userRegistration, Long>{
	
	

}
