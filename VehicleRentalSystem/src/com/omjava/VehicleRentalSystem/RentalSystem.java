package com.omjava.VehicleRentalSystem;

import java.util.ArrayList;
import java.io.InputStream;
import java.util.Scanner;

public class RentalSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Add vehicles to inventory
		Inventory inventory = new Inventory();
		
		inventory.addVehicle(new Car("C01", 2000, 4));
		inventory.addVehicle(new Car("C02", 3000, 5));
		inventory.addVehicle(new Bus("BS01", 6000, 14));
		inventory.addVehicle(new Bus("BS02", 9000, 20));
		inventory.addVehicle(new Bike("B01", 500, true));
		inventory.addVehicle(new Bike("B02", 500, true));
		
		//Add Customer
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		Customer customer = new Customer(name);
		
		boolean isRunning = true;
		while(isRunning) {
			System.out.println("________Vehicle Rental System________");
			System.out.println("1 : Show Available Cars");
			System.out.println("2 : Show Available Bike");
			System.out.println("3 : Show Available Buses");
			System.out.println("4 : Rent a Vehicle");
			System.out.println("5 : Return all Rented Vehicle");
			System.out.println("6 : View Rented Vehicles");
			System.out.println("7 : Send Vehicle for Maintainance");
			System.out.println("8 : Complete Vehcle Maintainance");
			System.out.println("9 : Show all Vehicles Info");
			System.out.println("10 : Admin - Add Vehicle");
			System.out.println("11 : Admin - Remove Vehicle");
			System.out.println("12 : Exit");
			System.out.println("------------------------");
			
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			
			switch (choice) {
			case  1->{inventory.ShowAvailableVehicle(Car.class);}
			case  2->{inventory.ShowAvailableVehicle(Bike.class);}
			case  3->{inventory.ShowAvailableVehicle(Bus.class);}
			case  4->{System.out.println("Enter Vehicle ID");
						
						String vehicleId = sc.next();
						System.out.println("Enter No of Days");
						int days=sc.nextInt();
						Vehicle vehicle = findVehicleById(inventory.getAllVehicle(), vehicleId);
						if(vehicle!=null) {
							customer.RentVehicle(vehicle, days);
						}
						else {
							System.out.println("Vehicle not found");
						}
					}
			case  5->{customer.ReturnAllVehicle();}
			case  6->{customer.ViewRentedVehicle();}
			case  7->{;}
			case  8->{;}
			case  9->{;}
			case  10->{if(Admin.authenticate()) {
				System.out.println("Enter the type of vehicle \n 1) Car \n 2) Bike \n 3) Bus");
				int n=sc.nextInt();
				System.out.println("Enter Vehicle id");
				String id=sc.next();
				System.out.println("Enter Rental rate");
				int rent=sc.nextInt();
				
				switch(n) {
				case 1->{System.out.println("Enter Seats");
						int seats=sc.nextInt();
						inventory.addVehicle(new Car(id,rent, seats));}
				case 2->{System.out.println("Helmet Available?");
						String ha=sc.next();
						boolean helmet= ha.equalsIgnoreCase("yes")?true:false;
						inventory.addVehicle(new Bike(id,rent, helmet));}
				case 3->{System.out.println("Enter Seats");
						int seats=sc.nextInt();
						inventory.addVehicle(new Bus(id,rent, seats));}
				}
				
			}else {
				System.out.println("Wrong Credentials");
			}
			}
			case  11->{;}
			case  12->{isRunning=false;}	
			default-> System.out.println("Invalid Option");
				
			}
			
		}
		
	}

	private static Vehicle findVehicleById(ArrayList<Vehicle> vehicles, String vehicleId) {
//	    if (vehicles == null || vehicleId == null) return null;

	    for (Vehicle vehicle : vehicles) {
	        if (vehicle.getVehicleId().equalsIgnoreCase(vehicleId)) {
	            return vehicle;
	        }
	    }
	    return null;
	}

	

}
