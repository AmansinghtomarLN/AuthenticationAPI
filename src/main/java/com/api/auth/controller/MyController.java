package com.api.auth.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @PostMapping("/signup")
    public Data_1 signup(@RequestBody Data_1 user) throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/authenticationapidb","root","root");

            String sql = "INSERT INTO userInfo (EmailId, Password, FirstName, LastName, Gender, DOB, Age, Mobno, Country)VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getFirstName());
            ps.setString(4, user.getLastName());
            ps.setString(5, user.getGender());
            ps.setString(6, user.getDob());
            ps.setInt(7, user.getAge());
            ps.setLong(8, user.getMobileno());
            ps.setString(9, user.getCountry());

            ps.executeUpdate();
          
           return user;
           

        
    }
}
