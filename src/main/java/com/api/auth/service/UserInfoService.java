package com.api.auth.service;

import java.util.List;


import com.api.auth.dto.UserInfoDTO;


public interface UserInfoService {

		public List<UserInfoDTO> getUserInfo();

		public UserInfoDTO getUserByEmail(String emailId);
		
		public List<UserInfoDTO> search(String column, String value);

	}


