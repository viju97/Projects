package com.lti.bean;

import com.oracle.webservices.internal.api.EnvelopeStyle;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Table(name = "user_details")
public class UserDetails {
	@Column(name = "FIRSTNAME")
	private String firstName;

	@Column(name = "LASTNAME")
	private String lastName;

	@Column(name = "AGE")
	private int age;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "MOBILE")
	private String mobile;

	@Column(name = "TYPE_OF_EMPLOYMENT")
	private String typeOfEmployment;

	@Id
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PASSWORD")
	private String password;

	@Column(name = "ADDRESS")
	private String Address;

	@Column(name = "STATE")
	private String state;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFirstName() {
		return firstName;
	}


	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public UserDetails() {
		super();
	}

	public UserDetails(String firstName, String lastName, int age, String gender, String mobile,
			String typeOfEmployment, String email, String password, String address, String state) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobile = mobile;
		this.typeOfEmployment = typeOfEmployment;
		this.email = email;
		this.password = password;
		Address = address;
		this.state = state;
	}

	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender=" + gender
				+ ", mobile=" + mobile + ", typeOfEmployment=" + typeOfEmployment + ", email=" + email + ", password="
				+ password + ", Address=" + Address + ", state=" + state + "]";
	}
}
