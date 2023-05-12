/**
 * 
 */
package com.javafundas;
import java.util.*;

/**
 * Application to login and book the seat
 * @author ssampath
 * Date 25/04/2023
 */
public class LoginAndBook {
	public static void main(String[] args) {
		System.out.println("**Welcome to Login Page**");
		System.out.print("Enter the username: ");
		Scanner scan=new Scanner(System.in);
		String userName=scan.nextLine();
		if(userName.equals("Sujithraa")) {
			System.out.print("Enter the password: ");
			String passWord=scan.nextLine();
			if(passWord.equals("Suji@1234")) {
				System.out.println("**You have successfully logged in and you can book the tickets now**");
				System.out.println("Enter the seat number: ");
				String seatNumber=scan.nextLine();
				boolean isAvailable=true; 
				if(isAvailable) {  //Checking seat availability
					System.out.println("**Your Seat "+seatNumber+" is booked successfully**");
				}else {
					System.out.println("Seat you are looking for is unavailable");
				}
			}else {
				System.out.println("Invalid Password");
			}
		}else {
			System.out.println("Invalid Username");
		}
		scan.close();
	}

}
