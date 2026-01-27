package com.api.auth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserLogin {
	@GetMapping("/userdetails/{email}/{password}")
	public String checkUser(@PathVariable  String email , @PathVariable  String password) throws ClassNotFoundException, SQLException{
//		        boolean result = emailValidation(email) ;
//		     if(result) {
		        if(emailValidation(email)) {
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
	   }else {
			 return "Please Enter Your Correct email";
	   }
	}

	public  boolean emailValidation(String email) {
		
		EmailValidation ev= new EmailValidation(); 
		if( ev.checkEmail(email) && ev.countOfCharacterInEmail(email)) {
			return true;
		}
		return false;
		
		
     	}
	@DeleteMapping("/{email}/{password}")
	public String delet(@PathVariable String email, @PathVariable String password) throws ClassNotFoundException, SQLException {
		 if(emailValidation(email)) {
		 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/authenticationapidb", "root", "root");
    	 
    	 String query="Delete from userInfo where EmailId=? AND Password=?";
    	 PreparedStatement ps=connection.prepareStatement(query);
    	 ps.setString(1, email);
    	 ps.setString(2, password);
    	 
    	int rs=ps. executeUpdate();
    	
		return "This email is deleted from databse:"+email;
		 }else {
			 return "Please Enter Your Valid Email and Password";
		 }
    	
	   }
	   
	@PutMapping("/{email}")
	public String put(@RequestBody  UserInfoForUpdate user,@PathVariable String email) throws ClassNotFoundException, SQLException {
		 if(emailValidation(email)) {
		 Class.forName("com.mysql.cj.jdbc.Driver");
    	 Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/authenticationapidb", "root", "root");
    	 
    	 String query="Update  userInfo SET FirstName=? , LastName=? , Age=? where emailId=?";
    	 PreparedStatement ps=connection.prepareStatement(query);
    	 ps.setString(1,user.getFname());
    	 ps.setString(2,user.getLname());
    	 ps.setInt(3,user.getAge() );
    	 ps.setString(4,email);
    	
    	 
    	int rs=ps. executeUpdate();
    	
    	if(rs==1) {
    		return "This is your updated entry";
    	}else {
    		return "Something wrong with your code";
    	}
		 }else {
			 return "Please Enter Your Valid Email ";
		 }
	
		 
	   }
	}
 

