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
@Table(name = "products")
@ApiModel(description = "Details about Products")
public class ProductModel {
	@ApiModelProperty(notes = "product_id")
	private Integer product_id;
	@ApiModelProperty(notes = "product_name")
	private String product_name;
	@ApiModelProperty(notes = "product_msrp")
	private float product_msrp;
	@ApiModelProperty(notes = "product_in_stock")
	private Integer product_in_stock;
	@ApiModelProperty(notes = "product_brand")
	private String product_brand;

	public ProductModel() {
	}

	public ProductModel(Integer product_id, String product_name, float product_msrp, Integer product_in_stock, String product_brand) {
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_msrp = product_msrp;
		this.product_in_stock = product_in_stock;
		this.product_brand = product_brand;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	public Integer getId() {
		return product_id;
	}
	

	@Column(name = "product_name")
	public String getName() {
		return product_name;
	}

	public void setName(String product_name) {
		this.product_name = product_name;
	}

	@Column(name = "product_msrp")
	public float getPrice() {
		return product_msrp;
	}

	public void setPrice(float product_msrp) {
		this.product_msrp = product_msrp;
	}

	@Column(name = "product_in_stock")
	public Integer getStock() {
		return product_in_stock;
	}

	public void setStock(Integer product_in_stock) {
		this.product_in_stock = product_in_stock;
	}

	@Column(name = "product_brand")
	public String getBrand() {
		return product_brand;
	}

	public void setBrand(String product_brand) {
		this.product_brand = product_brand;
	}

	public void setId(Integer product_id) {
		this.product_id = product_id;
	}

	@Override
	public String toString() {
		return "ProductModel [id=" + product_id + ", name=" + product_name + ", price=" + product_msrp + ", stock=" + product_in_stock + ", brand="
				+ product_brand + "]";
	}

}
