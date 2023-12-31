package com.example.car.carsample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.car.carsample.Entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

	List<Car> findAll();

	

}
