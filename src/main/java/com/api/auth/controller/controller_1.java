package com.api.auth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.api.auth.dto.UserInfoDTO;
import com.api.auth.service.UserInfoService;

@RestController
public class controller_1 {
	
	@Autowired
	UserInfoService service;
	
	@GetMapping("/search")//localhost//8080//search/{(searchBYColumnName)pathvarible}/value
	public List<UserInfoDTO> getUserInfo(){
		
		System.out.println("url working!!");
		return service.getUserInfo();
		
	}
	
	@GetMapping("/search/{emailId}")
	public UserInfoDTO getUserByEmail(@PathVariable String emailId) {
		return service.getUserByEmail(emailId);
	}
	
	@GetMapping("/search/{column}/{value}")
	public List<UserInfoDTO> search(
	        @PathVariable String column,
	        @PathVariable String value) {

	    return service.search(column, value);
	}

}
