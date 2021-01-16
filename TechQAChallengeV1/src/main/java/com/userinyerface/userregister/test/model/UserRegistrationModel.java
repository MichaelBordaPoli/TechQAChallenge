package com.userinyerface.userregister.test.model;

public class UserRegistrationModel {
	String password;
	String email;
	String domain;
	String ext;
	String elementPresent;
	String path;
	String firstName;
	String zip;
	String title;
	String city;
	String surname;
	String street;
	String box;
	String number;
	String bDay;
	String bMonth;
	String bYear;
	String age;
	String gender;
	public UserRegistrationModel(String password, String email, String domain, String ext, String elementPresent,
			String path, String firstName, String zip, String title, String city, String surname, String street,
			String box, String number, String bDay, String bMonth, String bYear, String age, String gender) {
		super();
		this.password = password;
		this.email = email;
		this.domain = domain;
		this.ext = ext;
		this.elementPresent = elementPresent;
		this.path = path;
		this.firstName = firstName;
		this.zip = zip;
		this.title = title;
		this.city = city;
		this.surname = surname;
		this.street = street;
		this.box = box;
		this.number = number;
		this.bDay = bDay;
		this.bMonth = bMonth;
		this.bYear = bYear;
		this.age = age;
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public String getDomain() {
		return domain;
	}
	public String getExt() {
		return ext;
	}
	public String getElementPresent() {
		return elementPresent;
	}
	public String getPath() {
		return path;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getZip() {
		return zip;
	}
	public String getTitle() {
		return title;
	}
	public String getCity() {
		return city;
	}
	public String getSurname() {
		return surname;
	}
	public String getStreet() {
		return street;
	}
	public String getBox() {
		return box;
	}
	public String getNumber() {
		return number;
	}
	public String getbDay() {
		return bDay;
	}
	public String getbMonth() {
		return bMonth;
	}
	public String getbYear() {
		return bYear;
	}
	public String getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}

	
	
}
