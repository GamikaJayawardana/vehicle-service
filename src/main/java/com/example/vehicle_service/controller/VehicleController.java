package com.example.vehicle_service.controller;

import com.example.vehicle_service.model.Vehicle;
import com.example.vehicle_service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    @Autowired
    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public ResponseEntity<List<Vehicle>> getAllVehicles() {
        List<Vehicle> vehicles = vehicleService.getAllVehicles();
        return ResponseEntity.ok(vehicles);
    }

 
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Vehicle>> getVehiclesByServiceYear(@PathVariable int year) {
        List<Vehicle> vehicles = vehicleService.getVehiclesByYear(year);
        return ResponseEntity.ok(vehicles);
    }

    @GetMapping("/type/{id}")
    public ResponseEntity<String> getVehicleTypeById(@PathVariable Long id) {
        return vehicleService.getVehicleTypeById(id)
                .map(ResponseEntity::ok) 
                .orElse(ResponseEntity.notFound().build()); 
    }

    @DeleteMapping("/year/{year}")
    public ResponseEntity<String> deleteVehiclesByYear(@PathVariable int year) {
        vehicleService.deleteVehiclesByYear(year);
        return ResponseEntity.ok("Successfully deleted all service records for the year: " + year);
    }
}