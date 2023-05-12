/**
 * 
 */
package com.funcassignment;
import java.util.*;
/**
 * Checking voting eligiblity
 * @author ssampath
 * Date 26/04/2023
 */
public class VotingEligiblity {
	public static boolean isValidAge(int age) {
		if((age>0)&&(age<=100)) {
			return(true);
		}else
			return(false);
	}
	public static boolean isEligible(int age) {
		if(age>=18)
			return(true);
		else
			return(false);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int age=scan.nextInt();
		boolean isValid=isValidAge(age);
		if(isValid) {
			System.out.println("Given age is valid");
			boolean isEligible=isEligible(age);
			if(isEligible)
				System.out.println("You are eligible for vote");
			else
				System.out.println("You are not eligible");
		}
		else
			System.out.println("Given age is invalid");
		scan.close();
	}

}
