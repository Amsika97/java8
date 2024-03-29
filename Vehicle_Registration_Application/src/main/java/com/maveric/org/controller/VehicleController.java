package com.maveric.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.maveric.org.entity.Vehicle;
import com.maveric.org.repository.VehicleRepository;
import com.maveric.org.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
//    private VehicleRepository vehicleRepository;
     VehicleService service;

    @GetMapping("/{vehicleNumber}")
    public Vehicle getVehicleInfo(@PathVariable String vehicleNumber) {
        return service.findByVehicleNumber(vehicleNumber);
    }

    @PostMapping("/register")
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle) {
        return service.saveDetails(vehicle);
    }
}