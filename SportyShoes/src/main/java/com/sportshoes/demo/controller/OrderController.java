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


import com.sportshoes.demo.model.OrderModel;

import com.sportshoes.demo.repository.OrderRepository;


import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/orders")

public class OrderController {
	@Autowired
	OrderRepository orderRepository;

	// insert new order into database
	@PostMapping("/add")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Order placed!")
	public OrderModel addOrder(@RequestBody OrderModel order) {

		return orderRepository.save(order);
	}

	// fetch all order list from database
	@GetMapping("/all")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "All order details!")
	@ApiOperation(value = "Fetch orders by order_id",
	notes = "Fetching order_id",
	response = OrderModel.class)
	public Iterable<OrderModel> allProduct() {

		return orderRepository.findAll();
	}

	// fetch specific order by their ID
	@GetMapping("/{order_id}")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Specific order detail!")
	@ApiOperation(value = "Fetch orders by order_id",
	notes = "Fetching order_id",
	response = OrderModel.class)
	public Optional<OrderModel> productById(@PathVariable("order_id") int order_id) {

		return orderRepository.findById(order_id);
	}

	// update existing order
	@PutMapping("/update")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Order details updated!")
	public OrderModel updateOrder(@RequestBody OrderModel order) {

		return orderRepository.save(order);
	}

	// delete order from database
	@DeleteMapping("/{order_id}")
	@ResponseStatus(value = HttpStatus.CREATED, reason = "Order deleted!")
	public void deleteProduct(@PathVariable("order_id") int order_id) {

		orderRepository.deleteById(order_id);
	}
}
