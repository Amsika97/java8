package com.maveric.org.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.maveric.org.entity.Automobile_Data;
import com.maveric.org.service.Automobile_Service;

@RestController
@RequestMapping("/api/automobile")
public class Automobile_Controller {
	
	
	@Autowired
	Automobile_Service service;
	
	Logger logger = LoggerFactory.getLogger(Automobile_Controller.class);
	
	@PostMapping(value="/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)	
	public ResponseEntity<String> getAutomobileRegister(@RequestBody Automobile_Data automobile){
		
		logger.info("Registering the automobile data ...");
		System.out.println("getAutomobileRegister");
		Automobile_Data register = service.getRegister(automobile);
		
		return ResponseEntity.status(HttpStatus.OK).body("Automobile registered succesfully") ;
		
	}
	
	@GetMapping(value="/getlist")
	public ResponseEntity<List> getAlllist(){
		logger.info("getting the list of all automobile .........");
		List automobile = service.getAllList();
		return ResponseEntity.status(HttpStatus.OK).body(automobile);
	}

}
