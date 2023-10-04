package com.example.car.carsample.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.car.carsample.Entity.Car;
import com.example.car.carsample.Exception.CarNotFoundException;
import com.example.car.carsample.service.CarService;

@RestController
@RequestMapping("/car")
public class CarController 
{
    @Autowired
    private CarService service;
    
   // @PreAuthorize()
	@GetMapping("/allCars")
	public List<Car> getAllCar(){
		List<Car> car = service.getAll();
		return car;
		
	}
	
	@GetMapping("/carbyid/{id}")
	public Optional<Car> getById(@PathVariable int id) throws CarNotFoundException {
		
		Optional<Car> car = service.getById(id);
		
		if(car == null) {
			throw new CarNotFoundException("id"+ id);
		}
		
		return car;
	}
	
	@PostMapping("/create")
	public ResponseEntity<Car> createCar(@RequestBody Car car) {
		 
	   car = service.create(car);
	   URI location =  ServletUriComponentsBuilder.fromCurrentRequest().path("{/id}")
			   .buildAndExpand(car.getCar_id()).toUri();
		return ResponseEntity.created(location).build();
	}
}
