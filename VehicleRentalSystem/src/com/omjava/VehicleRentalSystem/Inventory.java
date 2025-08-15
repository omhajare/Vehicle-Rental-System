package com.omjava.VehicleRentalSystem;

import java.util.ArrayList;

public class Inventory {
	
	private ArrayList<Vehicle> vehicles;

	public Inventory() {
		super();
		vehicles = new ArrayList<Vehicle>();
	}
	
	public void addVehicle(Vehicle veh) {
		vehicles.add(veh);
		
	}
	
	public void removeVehicle() {
		
	}
	// <?> Generic
	public void ShowAvailableVehicle(Class<?> type) {
		
		System.out.println("Available "+type.getSimpleName()+"s :");
		
		for (Vehicle vehicle : vehicles) {
			if(type.isInstance(vehicle) && vehicle.isAvailable()) {
				System.out.println(vehicle.getVehicleId());
			}
		}
		
	}
	
	public ArrayList<Vehicle> getAllVehicle() {
		return vehicles;
	}
	

}
