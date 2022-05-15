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

import com.sportshoes.demo.model.AdminModel;

import com.sportshoes.demo.repository.AdminRepository;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/admins")
public class AdminController {
	@Autowired
	AdminRepository adminRepository;

	// insert new admin into database
	@PostMapping("/add")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Admin Registration Success!")
	public AdminModel addAdmin(@RequestBody AdminModel admin) {

		return adminRepository.save(admin);

	}

	// fetch all admin list from database
	@GetMapping("/all")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "All admin details!")
	@ApiOperation(value = "Fetch Admins by admin_id", notes = "Fetching admin_id", response = AdminModel.class)
	public Iterable<AdminModel> allProduct() {

		return adminRepository.findAll();
	}

	// fetch specific admin by their ID
	@GetMapping("/{ADMIN_ID}")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Specific admin detail!")
	@ApiOperation(value = "Find Admins by admin_id", notes = "Provide an admin_id", response = AdminModel.class)
	public Optional<AdminModel> productById(@PathVariable("ADMIN_ID") int ADMIN_ID) {

		return adminRepository.findById(ADMIN_ID);
	}

	// update existing admin
	@PutMapping("/update")
	//@ResponseStatus(value = HttpStatus.CREATED, reason = "Admin details updated!")
	public AdminModel updateOrder(@RequestBody AdminModel admin) {

		return adminRepository.save(admin);
	}

	// delete admin from database
	@DeleteMapping("/{ADMIN_ID}")
	@ResponseStatus(value = HttpStatus.CREATED, reason = "Admin details deleted!")
	public void deleteAdmin(@PathVariable("ADMIN_ID") int ADMIN_ID) {

		adminRepository.deleteById(ADMIN_ID);
	}

}
