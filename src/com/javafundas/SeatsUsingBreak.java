/**
 * 
 */
package com.javafundas;

/**
 * Seat availability using break statement
 * @author ssampath
 * Date 25/04/2023
 */
public class SeatsUsingBreak {
	public static void main(String[] args) {
		int count=5;
		for(int i=10;i>=1;i++) {
			if(count==0) {
				System.out.println("All premium seats are booked \nAll VIP seats 1 to 5 are reserved");
				break;
			}
			System.out.println("Premium seat availability: "+count);
			count--;
		}
		
	}

}
