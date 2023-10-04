package com.example.car.carsample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.car.carsample.Entity.Car;
import com.example.car.carsample.repository.CarRepository;

@Service
public class CarService {

	@Autowired
	private CarRepository carRepository;

	public List<Car> getAll() {
		List<Car> car = carRepository.findAll();
		return car;
	}


	public Car create(Car car) {
		
		return carRepository.save(car);
	}


	public Optional<Car> getById(int id) {
		
		return carRepository.findById(id);
	}




	


	
	
	
	

}
