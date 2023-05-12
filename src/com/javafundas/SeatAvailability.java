/**
 * 
 */
package com.javafundas;
import java.util.*;

/**
 * Checking the availability of seat
 * @author ssampath
 * Date 25/04/2023
 */
public class SeatAvailability {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("**Welcome to Seat Booking page**");
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the seat number: "); //Getting seat number from the customer
		String seatNumber=sc.nextLine();
		boolean isAvailable=true; 
		if(isAvailable) {  //Checking seat availability
			System.out.println("**Your Seat "+seatNumber+" is booked successfully**");
		}
		else {
			System.out.println("Seat you are looking for is unavailable");
		}
		sc.close();
	}

}
