/**
 * 
 */
package com.assignment;
import java.util.*;
/**
 * Checking the increasing/ decreasing order
 * @author ssampath
 * Date 25/04/2023
 */
public class CheckingOrder {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		if((a>b)&&(b>c))
			System.out.println("Decreasing order");
		else if((a<b)&&(b<c))
			System.out.println("Increasing order");
		else
			System.out.println("Neither decreasing nor increasing");
		scan.close();
	}

}
