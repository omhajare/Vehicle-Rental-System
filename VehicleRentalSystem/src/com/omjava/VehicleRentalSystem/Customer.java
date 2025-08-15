package com.omjava.VehicleRentalSystem;

import java.util.ArrayList;

public class Customer {
	
	private String name;
	private ArrayList<Vehicle> RentedVehicle;
	private int RentedVehicleCount;
	
	public Customer(String name) {
		super();
		this.name = name;
		this.RentedVehicle = new ArrayList<>();
		this.RentedVehicleCount=0;
	}
	
	
	public void ReturnVehicle() {
		
	}
	
    public void ReturnAllVehicle() {
		for (Vehicle vehicle : RentedVehicle) {
			vehicle.ReturnVehicle();
		}
	}
	
	public void ViewRentedVehicle() {
		System.out.println("Rented Vehicles");
		for (Vehicle vehicle : RentedVehicle) {
			System.out.println("Vehicle id : "+vehicle.getVehicleId());
		}
		
	}

	public void RentVehicle(Vehicle vehicle, int days) {
		if(vehicle.isAvailable() && !vehicle.isUnderMaintainance()) {
			if (vehicle.Rent(name, days)) {
				RentedVehicle.add(vehicle);
				RentedVehicleCount++;
				System.out.println("Rented Vehicles ="+RentedVehicleCount);
			};
		}
		
	}


}
