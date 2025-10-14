package com.example.vehicle_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.vehicle_service.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    //crud
    
}