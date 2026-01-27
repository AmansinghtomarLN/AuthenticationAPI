package com.api.auth.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.api.auth.dto.UserInfoDTO;

@Repository
public class UserInfoRepo {

	
		
		 String url = "jdbc:mysql://localhost:3306/authenticationapidb";
		
		 String username = "root";
		
		 String password = "root";
		 
		 public List<UserInfoDTO> getUsers(){
			 
			 List<UserInfoDTO> users = new ArrayList<UserInfoDTO>();
			 String query = "select * from userinfo";
			 
			 try {
					
		    	 Class.forName("com.mysql.cj.jdbc.Driver");
					
		         Connection con = DriverManager.getConnection(url, username, password);  
		         
		         Statement st = con.createStatement();
		         
		         ResultSet rs = st.executeQuery(query);
		         
		         while (rs.next()) {
		        	 
		        	 UserInfoDTO u = new UserInfoDTO();
		        	 
		        	 u.setEmailId(rs.getString("EmailId")+" ");
		        	 
		        	 u.setPassword(rs.getString("Password")+" ");
		        	 
		        	 u.setFirstName(rs.getString("FirstName")+" ");
		        	 
		        	 u.setLastName(rs.getString("LastName")+" ");
		        	 
		        	 u.setGender(rs.getString("Gender")+" ");
		        	 
		        	 u.setDob(rs.getString("Dob")+" ");
		        	 
		        	 u.setAge(rs.getInt("Age")+" ");
		        	 
		        	 u.setMobNo(rs.getLong("MobNo")+" ");
		        	 
		        	 u.setCountry(rs.getString("Country")+" ");
		        	 
		        	 System.out.println("query run successfully  ");
		        	 
		        	 users.add(u);
		         }
		         
				 
			 }
			 catch (Exception e) {
				 
				 e.printStackTrace();
			 }
			 
			 return users;
		 }
		 

		public UserInfoDTO getUserByEmail(String emailId) {
			// TODO Auto-generated method stub
			
			UserInfoDTO u =null;
			
			String query = "SELECT * FROM userinfo WHERE EmailId LIKE ? ";
			
			 try {
					
		    	 Class.forName("com.mysql.cj.jdbc.Driver");
					
		         Connection con = DriverManager.getConnection(url, username, password);  
		         
		         PreparedStatement ps = con.prepareStatement(query);
		         
		         ps.setString(1, emailId);
		         
		         ResultSet rs = ps.executeQuery();
		         
		         if (rs.next()) {
		        	 
		        	  u = new UserInfoDTO();
		        	 
		        	 u.setEmailId(rs.getString("EmailId")+" ");
		        	 
		        	 u.setPassword(rs.getString("Password")+" ");
		        	 
		        	 u.setFirstName(rs.getString("FirstName")+" ");
		        	 
		        	 u.setLastName(rs.getString("LastName")+" ");
		        	 
		        	 u.setGender(rs.getString("Gender")+" ");
		        	 
		        	 u.setDob(rs.getString("Dob")+" ");
		        	 
		        	 u.setAge(rs.getInt("Age")+" ");
		        	 
		        	 u.setMobNo(rs.getLong("MobNo")+" ");
		        	 
		        	 u.setCountry(rs.getString("Country")+" ");
		        	 
		        	 System.out.println("query run successfully  ");
		        	 
		        	 
		         }
		         
				 
			 }
			 catch (Exception e) {
				 
				 e.printStackTrace();
			 }
			 
			 return u;
		}
		
		
		public String getCloumnName(String searchBy) {
			
			if(searchBy.equals("email")) {
				return "EmailId";
			}
			
			else if(searchBy.equals("name")) {
				return "FirstName";
			}
			
			else if(searchBy.equals("mobNo")) {
				return "MobNo";
			}
			
			else if(searchBy.equals("country")) {
				return "Country";
			}
			
			else {
				return null;
			}			
			
		}
		
		public List<UserInfoDTO> search(String searchBy, String value){
			
			List<UserInfoDTO> users = new ArrayList<UserInfoDTO>();
			
			String column = getCloumnName(searchBy);
			
			String query = "SELECT * FROM userinfo WHERE " + column + " LIKE ?";
			
			 try {
					
		    	 Class.forName("com.mysql.cj.jdbc.Driver");
					
		         Connection con = DriverManager.getConnection(url, username, password);  
		         
		         PreparedStatement ps = con.prepareStatement(query);
		         
		         ps.setString(1, "%" + value + "%");	
		         
		         ResultSet rs = ps.executeQuery();
		         
		         while (rs.next()) {
		        	 
		        	  UserInfoDTO u = new UserInfoDTO();
		        	 
		        	 u.setEmailId(rs.getString("EmailId")+" ");
		        	 
		        	 u.setPassword(rs.getString("Password")+" ");
		        	 
		        	 u.setFirstName(rs.getString("FirstName")+" ");
		        	 
		        	 u.setLastName(rs.getString("LastName")+" ");
		        	 
		        	 u.setGender(rs.getString("Gender")+" ");
		        	 
		        	 u.setDob(rs.getString("Dob")+" ");
		        	 
		        	 u.setAge(rs.getInt("Age")+" ");
		        	 
		        	 u.setMobNo(rs.getLong("MobNo")+" ");
		        	 
		        	 u.setCountry(rs.getString("Country")+" ");
		        	 
		        	 users.add(u);
		        	 
		        	 System.out.println("query run successfully  ");
		        	 
		        	 
		         }
		         
				 
			 }
			 catch (Exception e) {
				 
				 e.printStackTrace();
			 }
			 
			 return users;
			
			
		}
		
	

}
