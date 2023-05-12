/**
 * 
 */
package com.javafundas;

/**
 * Seat availability using nested loop
 * @author ssampath
 * Date 25/04/2023
 */
public class SeatNestedLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=2;i++) {
			System.out.println("Screen "+i+" Availability Details: ");
			for(int j=5;j>=1;j--) {
				System.out.println("Current Seat Availability: "+ j);
			}
			System.out.println("Seats filled in screen "+i);
			System.out.println("\n");
		}
	}

}
