package com.example.car.carsample.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Car 
 { 
	@Id
	@GeneratedValue
	private int car_id;
	private String car_name;
	private String car_Variant;
	
	
	  public Car() {
		// TODO Auto-generated constructor stub
	}
	public Car(String car_name, String car_Variant) {
		
		this.car_name = car_name;
		this.car_Variant = car_Variant;
	}

	public int getCar_id() {
		return car_id;	
	}
	
	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_Variant() {
		return car_Variant;
	}
	public void setCar_Variant(String car_Variant) {
		this.car_Variant = car_Variant;
	}
	@Override
	public String toString() {
		return "Car [car_id=" + car_id + ", car_name=" + car_name + ", car_Variant=" + car_Variant + "]";
	}
	

}
