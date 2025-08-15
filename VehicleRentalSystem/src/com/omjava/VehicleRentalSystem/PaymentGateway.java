package com.omjava.VehicleRentalSystem;

public class PaymentGateway {

	public static boolean processPayment(String name, double totalAmount) {
		System.out.println("Processing Payment");
		System.out.println("Customer name:"+name);
		System.out.println("Total Amount :"+totalAmount);
		System.out.println("Payment Successfull using Transaction ID :"+Math.random());
		return true;
		
	}

}
