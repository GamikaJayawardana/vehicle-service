package com.example.vehicle_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // JPA annotation to mark this class as a database entity
@AllArgsConstructor // Lombok annotation to generate an all-arguments constructor
@NoArgsConstructor // Lombok annotation to generate a no-argument constructor
@Data // Lombok annotation to generate getters, setters, toString, equals, and hashCode methods
@Table(name = "vehicles") // Specifies the table name in the database
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;
    private String vehicleType;
    private int serviceYear;
    
    
}