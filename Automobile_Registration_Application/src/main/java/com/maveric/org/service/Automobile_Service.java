package com.maveric.org.service;

import java.util.Collection;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.org.entity.Automobile_Data;
import com.maveric.org.repository.Automobile_Data_Repository;




@Service
public class Automobile_Service {
	
	Logger logger = LoggerFactory.getLogger(Automobile_Service.class);
	
	@Autowired
	Automobile_Data_Repository repo;

	public Automobile_Data getRegister(Automobile_Data automobile) {
		
		Automobile_Data save = repo.save(automobile);
		 	

		return  save;		
	}

	public List getAllList() {
		logger.info("hi in service of automobile getting list");
		List getalllist= repo.findAll().stream().map(Automobile -> Automobile.getOwner_name()+ " "+ Automobile.getManufacturer()).collect(Collectors.toList());
		return getalllist;
	}

}
