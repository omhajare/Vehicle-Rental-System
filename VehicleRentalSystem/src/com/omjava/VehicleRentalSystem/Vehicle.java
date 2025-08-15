package com.omjava.VehicleRentalSystem;

import java.util.Scanner;

public class Vehicle {
	
	private String VehicleId;
	private double RentalRate;
	private boolean isAvailable;
	private int RentedDays;
	private boolean UnderMaintainance;
	
	public Vehicle(String VehicleId, double rentalRate) {
		super();
		this.VehicleId = VehicleId;
		this.RentalRate = rentalRate;
		this.isAvailable = true;

		this.UnderMaintainance = false;
	}

	public String getVehicleId() {
		return VehicleId;
	}

	public double getRentalRate() {
		return RentalRate;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public int getRentedDays() {
		return RentedDays;
	}

	public boolean isUnderMaintainance() {
		return UnderMaintainance;
	}
	
	
	
	public boolean Rent(String name, int days) {
		double totalAmount= days*this.RentalRate;
		boolean payment = PaymentGateway.processPayment(name, totalAmount);
		if(payment) {
			this.isAvailable=false;
			this.RentedDays=days;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your email");
			String email = sc.nextLine();
			//EmailService.bookingConfirmationEmail(name, days, totalAmount, email, VehicleId);
			ReceiptGenerator.generateReceipt(name, totalAmount, days, VehicleId, RentalRate);
			return true;
		}
		else return false;
	}
	
	public void ReturnVehicle() {
		this.isAvailable=false;
		this.RentedDays=0;
		System.out.println("Vehicle Returned Successfully");
	}
	
	public void SendForMaintainance() {
		
	}
	
	public void CompleteMaintainance() {
		
	}

	


}
