/**
 * 
 */
package com.javafundas;
import java.util.*;

/**
 * For booking seat from the given option
 * @author ssampath
 * Date 25/04/2023
 */
public class BookingSeatOptions {
	public static void main(String[] args) {
		System.out.println("TYPES OF SEATS AVAILABLE: ");
		System.out.println("Regular\nPremium\nExecutive\nVIP");
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose any one of the option: ");
		String selectedOption=sc.nextLine();
		if(selectedOption.equals("Regular")) {
			System.out.println("You have selected the REGULAR seat and cost: 50");
		}else if(selectedOption.equals("Premium")) {
			System.out.println("You have selected the PREMIUM seat and cost: 100");
		}else if(selectedOption.equals("Executive")) {
			System.out.println("You have selected the EXECUTIVE seat and cost: 150");
		}else if(selectedOption.equals("VIP")) {
			System.out.println("You have selected the VIP seat and cost: 200");
		}else {
			System.out.println("Choose the valid option :(");
		}
		sc.close();
	}

}
