package com.maveric.org;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseInteractionService {

	@Autowired
	DatabaseInteractionRepository repo;
	
	public List<CustomerEntity> findAlldata() {
		
		return repo.findAll();

	}

	
	 
}
