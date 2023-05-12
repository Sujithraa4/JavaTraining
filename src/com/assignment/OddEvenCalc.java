package com.assignment;
import java.util.*;
/**
 * Calculations based on odd or even numbers
 * @author ssampath
  Date 27/04/2023
 */
public class OddEvenCalc {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int currentNumber=scan.nextInt();
		int result;
		if(currentNumber%2!=0)
			result=(currentNumber*3)+1;
		else
			result=currentNumber/2;
		System.out.println(result);
		scan.close();
	}

}
