package com.omjava.VehicleRentalSystem;

public class ReceiptGenerator {

	public static void generateReceipt(String name, double totalAmount, int days, String vehicleId, double rentalRate) {
		System.out.println("___________Receipt__________");
		System.out.println("Name"+name);
		System.out.println("Days"+days);
		System.out.println("Vehicle"+vehicleId);
		System.out.println("Rent"+rentalRate);
		System.out.println("Total Amount"+totalAmount);
		System.out.println("----------------------------");
		
	}

	

	

}
