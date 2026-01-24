package com.api.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {
	@GetMapping("/userdetails/{email}/{password}")
	public String checkUser(@PathVariable  String email , @PathVariable  String password) throws ClassNotFoundException, SQLException{
		
		
		 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/authenticationapidb", "root", "root");
    	 
    	 String query="select*from userInfo where EmailId=? AND Password=?";
    	 PreparedStatement ps=connection.prepareStatement(query);
    	 ps.setString(1, email);
    	 ps.setString(2, password);
    	 
    	ResultSet rs=ps. executeQuery();
    	
    	
    	if(rs.next()) {
    		return"Welcome you are login successfully";
    	}else {
    		return"Please enter your valid email and password";
    	}
	      
	}

}
