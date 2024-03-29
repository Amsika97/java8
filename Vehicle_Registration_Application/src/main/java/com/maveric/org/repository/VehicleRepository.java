package com.maveric.org.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maveric.org.entity.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	Vehicle findByVehicleNumber(String vehicleNumber);
}
