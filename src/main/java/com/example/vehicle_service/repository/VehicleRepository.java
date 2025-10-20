package com.example.vehicle_service.repository;

import com.example.vehicle_service.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    List<Vehicle> findByServiceYear(int serviceYear);

    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    Optional<String> findVehicleTypeByServiceId(@Param("serviceId") Long serviceId);

    @Transactional
    void deleteByServiceYear(int serviceYear);
}