package com.maveric.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maveric.org.entity.User_Data;
import com.maveric.org.service.UserService;


@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping(value ="/Registration", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String>  getUserRegister(@RequestBody User_Data User_Data) {
		
		 service.UserRegistration(User_Data);
//		 System.out.println(User_Data);
		return ResponseEntity.status(HttpStatus.OK).body("User_Data registered succesfully");
		};
	
	@GetMapping(value="/list")	
	public ResponseEntity<List<String>> getAllUser(){
		
//error//		return (ResponseEntity<List<User_Data>>) service.UserList();
		
		List<String> userList = service.UserList();
	    return ResponseEntity.ok(userList);
		
		
	}
		
	}


