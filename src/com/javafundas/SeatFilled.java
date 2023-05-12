/**
 * 
 */
package com.javafundas;

/**
 * Seat availability using for with decrement
 * @author ssampath
 * Date 25/04/2023
 */
public class SeatFilled {
	public static void main(String[] args) {
		for(int i=10;i>=1;i--) {
			System.out.println("Current Seat Availability: "+i);
		}
		System.out.println("Seats are filled");
		System.out.println("\n");
		System.out.println("\n");
		int j=10;
		while(j!=0) {
			System.out.println("Current Seat Availability: "+j);
			j--;
		}
		System.out.println("Seats are filled");
		System.out.println("\n");
		System.out.println("\n");
		int k=10;
		do {
			System.out.println("Current Seat Availability: "+k);
			k--;
		}while(k!=0);
		System.out.println("Seats are filled");
	}

}
