/**
 * 
 */
package com.arrayassignment;

import java.util.Scanner;

/**
 * Types of numbers in array
 * @author ssampath
 * Date 26/04/2023
 */
public class TypesOfNumbers {
	public static void posNeg(int arr[]) {
		int pos=0,neg=0,zero=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)
				pos++;
			else if(arr[i]<0)
				neg++;
			else
				zero++;
		}
		System.out.print(pos+" "+neg+" "+zero+" ");
	}
	public static void oddEven(int arr[]) {
		int odd=0,even=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0)
				odd++;
			else
				even++;
		}
		System.out.print(odd+" "+even);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		posNeg(arr);
		oddEven(arr);
		scan.close();
		
	}

}
