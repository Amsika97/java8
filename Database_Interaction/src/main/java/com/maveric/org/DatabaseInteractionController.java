package com.maveric.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/get")

public class DatabaseInteractionController {
	
	@Autowired

	DatabaseInteractionService service;

	@GetMapping("/AllData")
	public List<CustomerEntity> getAllData() {
		return service.findAlldata();
	}

}
