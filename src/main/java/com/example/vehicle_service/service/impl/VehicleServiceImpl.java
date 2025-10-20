package com.example.vehicle_service.service.impl;

import com.example.vehicle_service.model.Vehicle;
import com.example.vehicle_service.repository.VehicleRepository;
import com.example.vehicle_service.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public List<Vehicle> getVehiclesByYear(int year) {
        
        return vehicleRepository.findByServiceYear(year);
    }

    @Override
    public Optional<String> getVehicleTypeById(Long serviceId) {
        
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }

    @Override
    public void deleteVehiclesByYear(int year) {
        
        vehicleRepository.deleteByServiceYear(year);
    }

    @Override
    public Vehicle createVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
    
}