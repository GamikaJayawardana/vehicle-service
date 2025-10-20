package com.example.vehicle_service.service;

import com.example.vehicle_service.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface VehicleService {

    List<Vehicle> getAllVehicles();

    List<Vehicle> getVehiclesByYear(int year);

    Optional<String> getVehicleTypeById(Long serviceId);

    void deleteVehiclesByYear(int year);

    Vehicle createVehicle(Vehicle vehicle);
}