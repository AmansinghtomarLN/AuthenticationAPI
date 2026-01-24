package com.api.auth.controller;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.auth.dto.Userinforequest;
import com.api.auth.repository.DataBaseConnection;

@RestController
public class SignupController {

	DataBaseConnection db=new DataBaseConnection();
    @PostMapping("/signup")
    public Userinforequest signup(@RequestBody Userinforequest user) throws ClassNotFoundException, SQLException {
          
    	db.saveUser(user);
           return user;
          
    }
}
