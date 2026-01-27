CREATE DATABASE authenticationapidb;
USE authenticationapidb;
CREATE TABLE IF NOT EXISTS userInfo (
     EmailId VARCHAR(35) PRIMARY KEY,
     Password VARCHAR(10) UNIQUE KEY NOT NULL,
     FirstName VARCHAR(30) NOT NULL,
	 LastName VARCHAR(30) NOT NULL,
     Gender VARCHAR(10) NOT NULL,
     DOB DATE NOT NULL,
     Age INT(3) NOT NULL,
     MobNo BIGINT(10) NOT NULL,
     Country VARCHAR(30) NOT NULL
);
SHOW TABLES;

INSERT INTO userInfo values ('prati@gmail.com', 'prati1234', 'Pratibha', 'Chouhan', 'Female', '2002-05-21', 23, 9098058368, 'India');
INSERT INTO userInfo values ('ruchi@gmail.com', 'ruchi1234', 'Ruchi', 'Tiwari', 'Female', '2003-09-27', 22, 9691961342, 'India'),
('bhanu@gmail.com', 'bhanu123', 'Bhanu', 'Tomar', 'Male', '2002-09-04', 23, 9174922848, 'India'),
('amit.sharma@gmail.com', 'amit123', 'Amit', 'Sharma', 'Male', '2001-03-15', 24, 9876543210, 'India'),

('neha.verma@gmail.com', 'neha123', 'Neha', 'Verma', 'Female', '2000-07-22', 25, 9123456789, 'India'),

('rohit.patel@gmail.com', 'rohit123', 'Rohit', 'Patel', 'Male', '1999-11-10', 26, 9812345678, 'India'),

('pooja.singh@gmail.com', 'pooja123', 'Pooja', 'Singh', 'Female', '2002-01-05', 23, 9098765432, 'India'),

('rahul.jain@gmail.com', 'rahul123', 'Rahul', 'Jain', 'Male', '1998-06-18', 27, 9345678901, 'India'),

('kavita.mishra@gmail.com', 'kavita123', 'Kavita', 'Mishra', 'Female', '2001-12-30', 24, 9567890123, 'India'),

('sachin.yadav@gmail.com', 'sachin123', 'Sachin', 'Yadav', 'Male', '2000-04-25', 25, 9789012345, 'India'),

('anjali.gupta@gmail.com', 'anjali123', 'Anjali', 'Gupta', 'Female', '2003-08-14', 22, 9012345678, 'India'),

('vikas.mehta@gmail.com', 'vikas123', 'Vikas', 'Mehta', 'Male', '1997-09-09', 28, 9654321098, 'India'),

('sonam.chauhan@gmail.com', 'sonam123', 'Sonam', 'Chauhan', 'Female', '2002-02-20', 23, 9876501234, 'India');



SELECT * FROM userInfo;


