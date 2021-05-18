package com.train.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
	@Id
	@GeneratedValue
	private int userId;
	@Column(name = "username")
	private String uname;
	@Column(name = "password")
	private String pword;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneno")
	private String phoneno;
	@Column(name = "mailid")
	private String mailid;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getMailid() {
		return mailid;
	}

	public void setMailid(String mailid) {
		this.mailid = mailid;
	}

	public User(String uname, String pword, String firstname, String lastname, String address,
			String phoneno, String mailid) {
		super();
		this.uname = uname;
		this.pword = pword;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phoneno = phoneno;
		this.mailid = mailid;
	}

	public User() {
		super();
	}

	
	
}
