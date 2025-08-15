package com.omjava.VehicleRentalSystem;

public class Car extends Vehicle {
	
	private int NoOfSeats;

	public Car(String VehicleId, double rentalRate, int no) {
		super(VehicleId, rentalRate);
		this.NoOfSeats = no;
		
	}
	
	public void DisplayInfo() {
		
		System.out.println("Vehicle ID :"+getVehicleId() +"/nNo of Seats :"+NoOfSeats);
	}

}
