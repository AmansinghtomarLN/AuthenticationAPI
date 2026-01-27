package com.api.auth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.auth.dto.UserInfoDTO;
import com.api.auth.repository.UserInfoRepo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Autowired
	UserInfoRepo repo;

	@Override
	public List<UserInfoDTO> getUserInfo() {
		// TODO Auto-generated method stub
		return repo.getUsers();
	}

	@Override
	public UserInfoDTO getUserByEmail(String emailId) {
		// TODO Auto-generated method stub
		
	
	        return repo.getUserByEmail(emailId);
	   
	}
	
	public List<UserInfoDTO> search(String column, String value) {
	    return repo.search(column, value);
	}

	
}
	
	


