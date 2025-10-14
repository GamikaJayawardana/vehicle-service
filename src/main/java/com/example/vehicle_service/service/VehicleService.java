package com.example.vehicle_service.service;

import java.util.List;

import com.example.vehicle_service.model.Vehicle;

public interface VehicleService {
    Vehicle saveVehicle(Vehicle employee);
    List<Vehicle> getAllVehicles();
    Vehicle getVehicleById(Long id);
    Vehicle updateVehicle(Vehicle vehicle, Long id);
    void deleteVehicle(Long id);
}