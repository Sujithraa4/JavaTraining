/**
 * 
 */
package com.arrayassignment;

import java.util.Scanner;

/**
 * Student IDs of the students who are going to write extra assignments 
 * @author ssampath
 * Date 26/04/2023
 */
public class StudentIds {
	public static int average(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		int avg=sum/arr.length;
		return avg;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		int avg=average(arr);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<avg)
				System.out.print(i+" ");
		}
		scan.close();
	}

}
