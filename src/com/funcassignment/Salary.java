/**
 * 
 */
package com.funcassignment;
import java.util.*;
/**
 * Calculating the salary
 * @author ssampath
 * Date 26/04/2023
 */
public class Salary {
	public static int calculateSalary(int currentSalary,int hikePercentage) {
		int hike=(hikePercentage*currentSalary)/100;
		int salary=currentSalary+hike;
		return salary;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int currentSalary=scan.nextInt();
		int hikePercentage=scan.nextInt();
		int salary=calculateSalary(currentSalary,hikePercentage);
		System.out.println("Final salary: "+salary);
		scan.close();
	}

}
