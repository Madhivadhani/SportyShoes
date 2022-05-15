package com.sportshoes.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.sportshoes.demo.model.ProductModel;
import com.sportshoes.demo.repository.ProductRepository;

import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/products")
public class ProductController {
 
	@Autowired
	ProductRepository productRepository;

	// insert new product into database
	@PostMapping("/add")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Products Added!")
	public ProductModel addProduct(@RequestBody ProductModel product) {

		return productRepository.save(product);
	}

	// fetch all product list from database
	@GetMapping("/all")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "All product details!")
	@ApiOperation(value = "Fetch products by product_id",
	notes = "Fetching product_id",
	response = ProductModel.class)
	public Iterable<ProductModel> allProduct() {

		return productRepository.findAll();
	}

	// fetch specific product by their ID
	@GetMapping("/{product_id}")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Specific product!")
	@ApiOperation(value = "Fetch products by product_id",
	notes = "Fetching product_id",
	response = ProductModel.class)
	public Optional<ProductModel> productById(@PathVariable("product_id") int product_id) {

		return productRepository.findById(product_id);
	}

	// update existing product
	@PutMapping("/update")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Product details updated!")
	public ProductModel updateProduct(@RequestBody ProductModel product) {

		return productRepository.save(product);
	}

	// delete product from database
	@DeleteMapping("/{product_id}")
	@ResponseStatus(value = HttpStatus.CREATED, reason = "Product deleted!")
	public void deleteProduct(@PathVariable("product_id") int product_id) {

		productRepository.deleteById(product_id);
	}

	
}