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


import com.sportshoes.demo.model.UserModel;

import com.sportshoes.demo.repository.UserRepository;
import com.sportshoes.demo.exception.MyResourceNotCreatedException;
import com.sportshoes.demo.exception.MyResourceNotFoundException;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/users")

public class UserController {
	 
	@Autowired
	UserRepository userRepository;

	// insert new user into database
	@PostMapping("/add")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Registration Success!")
	public UserModel addUser(@RequestBody UserModel user) {
		
			return userRepository.save(user);
			
	}

	// fetch all user list from database
	@GetMapping("/all")
	//@ResponseStatus(value = HttpStatus.CREATED)
	@ApiOperation(value = "Fetch users by user_id",
	notes = "Fetching user_id",
	response = UserModel.class)
	public Iterable<UserModel> allProduct() {

		return userRepository.findAll();
	}

	// fetch specific user by their ID
	@GetMapping("/{user_id}")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Specific user!")
	@ApiOperation(value = "Fetch users by user_id",
	notes = "Fetching user_id",
	response = UserModel.class)
	public Optional<UserModel> productById(@PathVariable("user_id") int user_id) {

		return userRepository.findById((long) user_id);
	}

	// update existing user
	@PutMapping("/update")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "User details updated!")
	public UserModel updateUser(@RequestBody UserModel user) {

		return userRepository.save(user);
	}

	// delete user from database
	@DeleteMapping("/{user_id}")
	@ResponseStatus(value = HttpStatus.CREATED, reason = "User details deleted!")
	public void deleteProduct(@PathVariable("user_id") int user_id) {

		userRepository.deleteById((long) user_id);
	}
	}


