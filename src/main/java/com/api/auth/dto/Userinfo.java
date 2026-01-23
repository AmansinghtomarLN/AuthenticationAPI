package com.api.auth.dto;

public class Userinfo 
  {
	private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private Integer age;
    private Long mobileno;
    private String country;
    
    public Userinfo() {
    	
    }

 
    public Userinfo(String email, String password, String firstName, String lastName, String gender, String dob,
			int age, long mobileno, String country) {
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.mobileno = mobileno;
		this.country = country;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Long getMobileno() {
		return mobileno;
	}


	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}
	
}
