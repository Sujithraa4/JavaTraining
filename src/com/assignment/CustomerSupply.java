/**
 * 
 */
package com.assignment;

import java.util.Scanner;

/**
 * Stock supply
 * @author ssampath
 * Date 25/04/2023
 */
public class CustomerSupply {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int stock=scan.nextInt();
		int order=scan.nextInt();
		String credit=scan.next();
		if(order<=stock) {
			if(credit.equals("N")) {
				System.out.println(order+" supplied");
			}
			else
				System.out.println("Cannot supply");
		}
		else if(credit.equals("N")) {
			System.out.println(order+" supplied. Out of stock. Balance will be refunded");
		}
		scan.close();
	}
}
