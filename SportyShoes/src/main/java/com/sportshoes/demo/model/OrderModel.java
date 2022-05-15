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
@Table(name = "orders")
@ApiModel(description = "About Order Details")
public class OrderModel {
	@ApiModelProperty(notes = "order_id")
	private Long order_id;
	@ApiModelProperty(notes = "order_date")
	private Integer order_date;
	@ApiModelProperty(notes = "order_quntity")
	private Integer order_quntity;
	@ApiModelProperty(notes = "user_id")
	private Integer user_id;

	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderModel(Long order_id, Integer order_date, Integer order_quntity, Integer user_id) {
		super();
		this.order_id = order_id;
		this.order_date = order_date;
		this.order_quntity = order_quntity;
		this.user_id = user_id;
	}

	@Id
	
	@Column(name = "order_id")
	public Long getOrder_id() {
		return order_id;
	}

	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	@Column(name = "order_date")
	public Integer getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Integer order_date) {
		this.order_date = order_date;
	}
	@Column(name = "order_quntity")
	public Integer getOrder_quntity() {
		return order_quntity;
	}

	public void setOrder_quntity(Integer order_quntity) {
		this.order_quntity = order_quntity;
	}
	@Column(name = "user_id")
	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "OrderModel [order_id=" + order_id + ", order_date=" + order_date + ", order_quntity=" + order_quntity
				+ ", user_id=" + user_id + "]";
	}
	
	
	
}
