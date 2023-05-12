/**
 * 
 */
package com.arrayassignment;

import java.util.Scanner;

/**
 * Finding the duplicates
 * @author ssampath
 * Date 26/04/2023
 */
public class DuplicateElements {
	public static void duplicate(int arr[]) {
		int counter[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			counter[arr[i]]++;
		}
		boolean check=true;
		for(int i=0;i<arr.length;i++) {
			if(counter[i]>=2) {
				check=true;
				System.out.print(i+" ");
			}
			else
				check=false;
		}
		if (!check)
			System.out.println("-1");
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		duplicate(arr);
		scan.close();
	}
}
