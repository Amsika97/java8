package com.maveric.org.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maveric.org.entity.Vehicle;
import com.maveric.org.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	VehicleRepository repo;

	public Vehicle findByVehicleNumber(String vehicleNumber) {
		return repo.findByVehicleNumber(vehicleNumber);
		
	}

	public Vehicle saveDetails(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return repo.save(vehicle);
	}
	
	

}
