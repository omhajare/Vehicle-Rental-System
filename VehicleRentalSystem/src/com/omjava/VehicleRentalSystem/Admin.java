package com.omjava.VehicleRentalSystem;

import java.util.Scanner;

public class Admin {
	private static String username="admin";
	private static String password ="admin@123";
	

	public static boolean authenticate() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Username");
		String user=sc.next();
		System.out.println("Enter Password");
		String pass= sc.next();
		if(username.equalsIgnoreCase(user) && password.equals(pass)) {
			return true;
		}
		else return false;
		
		
	}

}
