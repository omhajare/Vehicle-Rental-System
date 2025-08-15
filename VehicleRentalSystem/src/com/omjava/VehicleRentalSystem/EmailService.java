package com.omjava.VehicleRentalSystem;


import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


//activation-1.1.1.jar
//java.mail-1.6.2.jar

public class EmailService {
	
	private final static String SenderMail ="omhajare0708@gmail.com";
	private final static String SenderPass ="hbpq abac qmyl pmln";

	public static void bookingConfirmationEmail(String name, int days, double totalAmount, String email,
			String vehicleId) {
		
		String subject ="Rental Vehicle Booking Confirmation";
		String body = "Hello "+name+"/n/n"+"Your Vehicle with ID "+vehicleId+" is booked sucessfully for "+days+"./n/n"+"Total Amount Paid :"+totalAmount+" /n/n"+"Thankyou."; 
		
		
		Properties properties = new Properties();
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.port", "587");
		properties.setProperty("mail.smtp.host", "smtp.gmail.com");
		properties.setProperty("mail.smtp.starttls.enable", "true");

		
		Session session = Session.getInstance(properties,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				// TODO Auto-generated method stub
				return new PasswordAuthentication(SenderMail, SenderPass);
			}
		});
		
		Message message = new MimeMessage(session);
		try {
			message.setFrom(new InternetAddress(SenderMail));
		    message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(email));
		    message.setSubject(subject);
		    message.setText(body);
		    
		    Transport.send(message);
		    System.out.println("Email Sent");
		    
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Email Sent"); 
		
	}
}
	
	


