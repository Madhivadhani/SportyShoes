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
@Table(name = "admins")
@ApiModel(description = "Details about Admin")
public class AdminModel {
	@ApiModelProperty(notes = "Admin_id")
	private Integer ADMIN_ID;
	@ApiModelProperty(notes = "Admin_name")
	private String ADMIN_NAME;
	@ApiModelProperty(notes = "Admin_password")
	private String ADMIN_PASSWORD;

	public AdminModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdminModel(Integer aDMIN_ID, String aDMIN_NAME, String aDMIN_PASSWORD) {
		super();
		ADMIN_ID = aDMIN_ID;
		ADMIN_NAME = aDMIN_NAME;
		ADMIN_PASSWORD = aDMIN_PASSWORD;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ADMIN_ID")
	public Integer getADMIN_ID() {
		return ADMIN_ID;
	}

	public void setADMIN_ID(Integer aDMIN_ID) {
		ADMIN_ID = aDMIN_ID;
	}
	@Column(name = "ADMIN_NAME")
	public String getADMIN_NAME() {
		return ADMIN_NAME;
	}

	public void setADMIN_NAME(String aDMIN_NAME) {
		ADMIN_NAME = aDMIN_NAME;
	}
	@Column(name = "ADMIN_PASSWORD")
	public String getADMIN_PASSWORD() {
		return ADMIN_PASSWORD;
	}

	public void setADMIN_PASSWORD(String aDMIN_PASSWORD) {
		ADMIN_PASSWORD = aDMIN_PASSWORD;
	}

	@Override
	public String toString() {
		return "AdminModel [ADMIN_ID=" + ADMIN_ID + ", ADMIN_NAME=" + ADMIN_NAME + ", ADMIN_PASSWORD=" + ADMIN_PASSWORD
				+ "]";
	}

	
	
}
