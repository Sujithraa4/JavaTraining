/**
 * 
 */
package com.assignment;
import java.util.*;
/**
 * To return sum of two numbers or 19
 * @author ssampath
 * Date 25/04/2023
 */
public class SumOrTeen {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter inputs: ");
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(((a>=13)&&(a<=19))||((b>=13)&&(b<=19))) {
			System.out.println("Output: 19");
		}
		else {
			int c=a+b;
			System.out.println("Output: "+c);
		}
		scan.close();
	}

}
