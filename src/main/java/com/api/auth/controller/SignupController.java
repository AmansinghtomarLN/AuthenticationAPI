package com.api.auth.controller;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.auth.dto.Userinforequest;
import com.api.auth.repository.DataBaseConnection;
import com.api.auth.util.Requestvalidator;

@RestController
public class SignupController {

	Requestvalidator rv=new Requestvalidator();
	DataBaseConnection db=new DataBaseConnection();
	
    @PostMapping("/signup")
    public Userinforequest signup(@RequestBody Userinforequest user) throws ClassNotFoundException, SQLException {
          
    	 rv.fullnamevalidation(user.getFirstName(),user.getLastName());
    	 rv.mobilenovalidation(user.getMobileno());
    	 rv.passwordvalidation(user.getPassword());
    	 db.saveUser(user);
           return user;    
    }
}
