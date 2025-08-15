package com.omjava.VehicleRentalSystem;

public class Bike extends Vehicle {
	
	private boolean HelmetAvailable;

	public Bike(String VehicleId, double rentalRate, boolean helmet) {
		super(VehicleId, rentalRate);
		this.HelmetAvailable = helmet;
		
	}
	
	public void DisplayInfo() {
			
			System.out.println("Vehicle ID :"+getVehicleId() +"/nHelmet Available :"+(HelmetAvailable?"YES":"NO"));
	}


}
