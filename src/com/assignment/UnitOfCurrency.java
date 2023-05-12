package com.assignment;
import java.util.*;
/**
 * CHECKING THE UNIT OF CURRENCY IN INDIA
 * @author ssampath
 * Date 27/04/2023
 */
public class UnitOfCurrency {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the unit of currency in india?");
		for(int i=0;i<3;i++) {
			String userAnswer=scan.nextLine();
			if(userAnswer.equals("Rupee"))
				System.out.println("Answer is correct");
			else if(i>1)
				System.out.println("Sorry! It is rupee.");
			else
				System.out.println("Try again!");
		}
		scan.close();
	}

}
