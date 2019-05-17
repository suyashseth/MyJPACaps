package com.jpa.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_table")
public class User {

	@Id
	@Column(name = "uid")
	private int userid;
	@Column(name = "uname")
	private String username;
	@Column(name = "userPassword")
	private String userpass;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", userpass=" + userpass + "]";
	}
	
	
}
