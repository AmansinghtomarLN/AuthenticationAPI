package com.api.auth.controller;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.auth.dto.Userinfo;
import com.api.auth.repository.DataBaseConnection;

@RestController
public class MyController {

	DataBaseConnection db=new DataBaseConnection();
    @PostMapping("/signup")
    public Userinfo signup(@RequestBody Userinfo user) throws ClassNotFoundException, SQLException {
          
    	db.saveUser(user);
           return user;
          
    }
}
