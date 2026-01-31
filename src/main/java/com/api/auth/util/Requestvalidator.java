package com.api.auth.util;

public class Requestvalidator 
{

		public void fullnamevalidation(String firstname, String lastname) {

	        if (firstname == null || lastname == null) {
	            throw new IllegalArgumentException("First name or last name cannot be null");
	        }

	        if (firstname.isEmpty() || lastname.isEmpty()) {
	            throw new IllegalArgumentException("First name or last name cannot be empty");
	        }

	        if (firstname.length() > 20 || lastname.length() > 20) {
	            throw new IllegalArgumentException("Name should not exceed 20 characters");
	        }

	        for (char c : firstname.toCharArray()) {
	            if (!Character.isLetter(c)) {
	                throw new IllegalArgumentException("First name must contain only letters");
	            }
	        }

	        for (char c : lastname.toCharArray()) {
	            if (!Character.isLetter(c)) {
	                throw new IllegalArgumentException("Last name must contain only letters");
	            }
	        }
	    }
		
		
		public void mobilenovalidation(Long mobno) {

		 if (mobno == null) 
		 {
		        throw new IllegalArgumentException("Mobile number can't be null");
		 }
		if (mobno < 1000000000L || mobno > 9999999999L) 
		{
	        throw new IllegalArgumentException("Mobile number must be exactly 10 digits");
		}
		
    	}
		
		
	public void gendervalidation(String gender) 
	{
		if(gender==null) {
			   throw new IllegalArgumentException("gender can't be null");
        }
		
		if(gender.isEmpty()) {
				  throw new IllegalArgumentException("gender can't be empty");
		}
		
	 if (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female"))
		{
			throw new IllegalArgumentException("gender should be male or female");
		}
	}
	
	public void passwordvalidation(String password) 
	{
		    if (password == null || password.length() < 8)
		        throw new IllegalArgumentException("Password must be at least 8 characters long");

		    boolean upper=false, lower=false, digit=false, special=false;

		    for (char c : password.toCharArray()) {
		        if (Character.isUpperCase(c)) upper = true;
		        else if (Character.isLowerCase(c)) lower = true;
		        else if (Character.isDigit(c)) digit = true;
		        else special = true;
		    }

		    if (!(upper && lower && digit && special))
		        throw new IllegalArgumentException("Password must contain uppercase, lowercase, digit and special character");
		}

	}


