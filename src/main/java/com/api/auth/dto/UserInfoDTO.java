package com.api.auth.dto;

public class UserInfoDTO {
	
	private String emailId;
	private String password;
	private String firstName;
	private String lastName;
	private String gender;
	private String dob;
	private String age;
	private String mobNo;
	private String country;
	
	
	
	public UserInfoDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserInfoDTO(String emailId, String password, String firstName, String lastName, String gender, String dob, String age,
			String mobNo, String country) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dob = dob;
		this.age = age;
		this.mobNo = mobNo;
		this.country = country;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
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
	public void setGender(String string) {
		this.gender = string;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String string) {
		this.age = string;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String string) {
		this.mobNo = string;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String string) {
		this.country = string;
	}
	@Override
	public String toString() {
		return "UserInfo [emailId=" + emailId + ", password=" + password + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", dob=" + dob + ", age=" + age + ", mobNo=" + mobNo + ", country="
				+ country + "]";
	}
	
	
	
	
	
	

}
