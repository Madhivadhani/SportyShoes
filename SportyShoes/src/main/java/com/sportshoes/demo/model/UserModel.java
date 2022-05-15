package com.sportshoes.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "users")
@ApiModel(description = "Details about Users")
public class UserModel {
	@ApiModelProperty(notes = "user_id")
	private Long user_id;
	@ApiModelProperty(notes = "user_email")
	private String user_email;
	@ApiModelProperty(notes = "user_password")
	private String user_password;
	@ApiModelProperty(notes = "user_name")
	private String user_name;
	
	

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(Long user_id, String user_email, String user_password, String user_name) {
		super();
		this.user_id = user_id;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_name = user_name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	@Column(name = "user_email")
	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Column(name = "user_password")
	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	@Column(name = "user_name")
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "UserModel [user_id=" + user_id + ", user_email=" + user_email + ", user_password=" + user_password
				+ ", user_name=" + user_name + "]";
	}

}
